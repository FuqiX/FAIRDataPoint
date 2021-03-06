/**
 * The MIT License
 * Copyright © 2017 DTL
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package nl.dtls.fairdatapoint.service.metadata.repository;

import nl.dtls.fairmetadata4j.model.CatalogMetadata;
import nl.dtls.fairmetadata4j.model.FDPMetadata;
import nl.dtls.fairdatapoint.api.dto.metadata.RepositoryMetadataChangeDTO;
import nl.dtls.fairdatapoint.api.dto.metadata.RepositoryMetadataDTO;
import nl.dtls.fairdatapoint.service.metadata.catalog.CatalogMetadataMapper;
import nl.dtls.fairdatapoint.service.metadata.common.MetadataMapper;
import nl.dtls.fairdatapoint.service.uri.UriMapper;
import org.eclipse.rdf4j.model.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;
import static nl.dtls.fairdatapoint.util.ValueFactoryHelper.i;
import static nl.dtls.fairdatapoint.util.ValueFactoryHelper.l;

@Service
public class RepositoryMetadataMapper implements MetadataMapper<FDPMetadata, RepositoryMetadataChangeDTO> {

    @Autowired
    private UriMapper uriMapper;

    @Autowired
    private CatalogMetadataMapper catalogMetadataMapper;

    public RepositoryMetadataDTO toDTO(FDPMetadata r, List<CatalogMetadata> catalogs) {
        return new RepositoryMetadataDTO(
                r.getIdentifier().getIdentifier().getLabel(),
                r.getUri().toString(),
                r.getTitle().getLabel(),
                ofNullable(r.getDescription()).map(Literal::getLabel),
                r.getIssued().getLabel(),
                r.getModified().getLabel(),
                r.getVersion().getLabel(),
                ofNullable(r.getLicense()).map(uriMapper::toDTO),
                r.getAccessRights().getDescription().getLabel(),
                uriMapper.toDTO(r.getSpecification()),
                ofNullable(r.getLanguage()).map(uriMapper::toDTO),
                uriMapper.toDTO(r.getPublisher().getUri()),
                catalogs
                        .stream()
                        .map(c -> catalogMetadataMapper.toSimpleDTO(c))
                        .collect(Collectors.toList())
        );
    }

    public FDPMetadata fromChangeDTO(FDPMetadata metadata, RepositoryMetadataChangeDTO reqDto) {
        metadata.setTitle(l(reqDto.getTitle()));
        metadata.setDescription(l(reqDto.getDescription()));
        metadata.setVersion(l(reqDto.getVersion()));
        metadata.setLicense(i(reqDto.getLicense()));
        metadata.setLanguage(i(reqDto.getLanguage()));
        return metadata;
    }

}
