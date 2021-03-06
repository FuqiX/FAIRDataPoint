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
package nl.dtls.fairdatapoint.database.rdf.migration.development.metadata.data;

import nl.dtls.fairmetadata4j.model.*;
import nl.dtls.fairdatapoint.service.metadata.common.MetadataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;

@Service
public class MetadataFixtures {

    @Autowired
    protected MetadataFactory metadataFactory;

    public FDPMetadata repositoryMetadata(String repositoryUrl) {
        return metadataFactory.createFDPMetadata(
                "My FAIR Data Point",
                "Duis pellentesque, nunc a fringilla varius, magna dui porta quam, nec ultricies augue turpis sed " +
                        "velit. Donec id consectetur ligula. Suspendisse pharetra egestas massa, vel varius leo " +
                        "viverra at. Donec scelerisque id ipsum id semper. Maecenas facilisis augue vel justo " +
                        "molestie aliquet. Maecenas sed mattis lacus, sed viverra risus. Donec iaculis quis lacus " +
                        "vitae scelerisque. Nullam fermentum lectus nisi, id vulputate nisi congue nec. Morbi " +
                        "fermentum justo at justo bibendum, at tempus ipsum tempor. Donec facilisis nibh sed lectus " +
                        "blandit venenatis. Cras ullamcorper, justo vitae feugiat commodo, orci metus suscipit purus," +
                        " quis sagittis turpis ante eget ex. Pellentesque malesuada a metus eu pulvinar. Morbi rutrum" +
                        " euismod eros at varius. Duis finibus dapibus ex, a hendrerit mauris efficitur at.",
                repositoryUrl
        );
    }

    public CatalogMetadata catalog1(String repositoryUrl, FDPMetadata repository) {
        return metadataFactory.createCatalogMetadata(
                "Bio Catalog",
                "Nam eget lorem rhoncus, porta odio at, pretium tortor. Morbi dapibus urna magna, at mollis neque " +
                        "sagittis et. Praesent fringilla, justo malesuada gravida cursus, nibh augue semper enim, et " +
                        "efficitur augue justo id odio. Donec id malesuada leo, vel molestie sem. Sed vitae libero a " +
                        "tortor vestibulum ullamcorper vitae ac turpis. Proin posuere nisl sit amet mollis auctor. In" +
                        " vehicula fringilla lorem, a tristique ligula. Vivamus fringilla leo molestie pellentesque " +
                        "vehicula. Nam aliquet condimentum varius. In hac habitasse platea dictumst. Maecenas " +
                        "elementum neque ac ex ultricies auctor. Vestibulum aliquet porttitor enim eu pellentesque. " +
                        "Aenean dapibus tellus ipsum.",
                "catalog-1",
                Arrays.asList("https://www.wikidata.org/wiki/Q27317", "https://purl.org/example#theme"),
                repositoryUrl,
                repository
        );
    }

    public CatalogMetadata catalog2(String repositoryUrl, FDPMetadata repository) {
        return metadataFactory.createCatalogMetadata(
                "Tech Catalog",
                "Nam eget lorem rhoncus, porta odio at, pretium tortor. Morbi dapibus urna magna, at mollis neque " +
                        "sagittis et. Praesent fringilla, justo malesuada gravida cursus, nibh augue semper enim, et " +
                        "efficitur augue justo id odio. Donec id malesuada leo, vel molestie sem. Sed vitae libero a " +
                        "tortor vestibulum ullamcorper vitae ac turpis. Proin posuere nisl sit amet mollis auctor. In" +
                        " vehicula fringilla lorem, a tristique ligula. Vivamus fringilla leo molestie pellentesque " +
                        "vehicula. Nam aliquet condimentum varius. In hac habitasse platea dictumst. Maecenas " +
                        "elementum neque ac ex ultricies auctor. Vestibulum aliquet porttitor enim eu pellentesque. " +
                        "Aenean dapibus tellus ipsum.",
                "catalog-2",
                Arrays.asList("https://www.wikidata.org/wiki/Q27318", "https://purl.org/example#theme"),
                repositoryUrl,
                repository
        );
    }

    public CatalogMetadata catalog3(String repositoryUrl, FDPMetadata repository) {
        return metadataFactory.createCatalogMetadata(
                "IT Catalog",
                "Nam eget lorem rhoncus, porta odio at, pretium tortor. Morbi dapibus urna magna, at mollis neque " +
                        "sagittis et. Praesent fringilla, justo malesuada gravida cursus, nibh augue semper enim, et " +
                        "efficitur augue justo id odio. Donec id malesuada leo, vel molestie sem. Sed vitae libero a " +
                        "tortor vestibulum ullamcorper vitae ac turpis. Proin posuere nisl sit amet mollis auctor. In" +
                        " vehicula fringilla lorem, a tristique ligula. Vivamus fringilla leo molestie pellentesque " +
                        "vehicula. Nam aliquet condimentum varius. In hac habitasse platea dictumst. Maecenas " +
                        "elementum neque ac ex ultricies auctor. Vestibulum aliquet porttitor enim eu pellentesque. " +
                        "Aenean dapibus tellus ipsum.",
                "catalog-3",
                Arrays.asList("https://www.wikidata.org/wiki/Q27318", "https://purl.org/example#theme"),
                repositoryUrl,
                repository
        );
    }

    public DatasetMetadata dataset1(String repositoryUrl, CatalogMetadata catalog) {
        return metadataFactory.createDatasetMetadata(
                "Cat Dataset",
                "Sed hendrerit accumsan velit, ut eleifend lorem rhoncus a. Curabitur auctor euismod risus lobortis " +
                        "viverra. Donec finibus ultricies venenatis. Suspendisse non pulvinar augue, vel dictum erat." +
                        " Praesent placerat ultrices tempor. Pellentesque posuere sapien eu rutrum efficitur. Quisque" +
                        " ac risus malesuada, tempus diam at, elementum urna. Suspendisse quis posuere leo.",
                "dataset-1",
                Arrays.asList("https://www.wikidata.org/wiki/Q27318", "https://www.wikidata.org/wiki/Q27319", "https" +
                        "://purl.org/example#theme"),
                Arrays.asList("Text Mining", "Natural Language Processing"),
                repositoryUrl,
                catalog
        );
    }

    public DatasetMetadata dataset2(String repositoryUrl, CatalogMetadata catalog) {
        return metadataFactory.createDatasetMetadata(
                "Dog Dataset",
                "Sed hendrerit accumsan velit, ut eleifend lorem rhoncus a. Curabitur auctor euismod risus lobortis " +
                        "viverra. Donec finibus ultricies venenatis. Suspendisse non pulvinar augue, vel dictum erat." +
                        " Praesent placerat ultrices tempor. Pellentesque posuere sapien eu rutrum efficitur. Quisque" +
                        " ac risus malesuada, tempus diam at, elementum urna. Suspendisse quis posuere leo.",
                "dataset-2",
                Arrays.asList("https://www.wikidata.org/wiki/Q27318", "https://purl.org/example#theme"),
                Arrays.asList("Text Mining", "Natural Language Processing"),
                repositoryUrl,
                catalog
        );
    }

    public DatasetMetadata dataset3(String repositoryUrl, CatalogMetadata catalog) {
        return metadataFactory.createDatasetMetadata(
                "Pig Dataset",
                "Sed hendrerit accumsan velit, ut eleifend lorem rhoncus a. Curabitur auctor euismod risus lobortis " +
                        "viverra. Donec finibus ultricies venenatis. Suspendisse non pulvinar augue, vel dictum erat." +
                        " Praesent placerat ultrices tempor. Pellentesque posuere sapien eu rutrum efficitur. Quisque" +
                        " ac risus malesuada, tempus diam at, elementum urna. Suspendisse quis posuere leo.",
                "dataset-3",
                Arrays.asList("https://www.wikidata.org/wiki/Q27318", "https://purl.org/example#theme"),
                Arrays.asList("Text Mining", "Natural Language Processing"),
                repositoryUrl,
                catalog
        );
    }

    public DistributionMetadata distribution1(String repositoryUrl, DatasetMetadata dataset) {
        return metadataFactory.createDistributionMetadata(
                "Downloadable Distribution",
                "Maecenas et mollis purus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere " +
                        "cubilia Curae; Pellentesque pulvinar augue at ultricies placerat. Vestibulum faucibus sem " +
                        "vel massa egestas consectetur at et nisi. Nullam consectetur, mi et lacinia commodo, arcu " +
                        "eros tempus risus, nec porta justo metus in orci. Pellentesque mattis tortor a ultrices " +
                        "pharetra. Phasellus tristique urna orci, ut vulputate tortor accumsan sit amet. Nulla sed " +
                        "nunc varius, finibus sapien eget, venenatis tortor. Nam gravida diam ut sapien sodales, ut " +
                        "sodales tellus feugiat. Duis auctor rutrum dictum. Phasellus facilisis, nibh at tempus " +
                        "efficitur, odio sem molestie lectus, at bibendum metus orci in nibh. Mauris facilisis est " +
                        "nibh, vitae iaculis risus lacinia at. Aliquam in lectus est.",
                "distribution-1",
                "http://example.com",
                null,
                "text/plain",
                repositoryUrl,
                dataset
        );
    }

    public DistributionMetadata distribution2(String repositoryUrl, DatasetMetadata dataset) {
        return metadataFactory.createDistributionMetadata(
                "Accessible Distribution",
                "Maecenas et mollis purus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere " +
                        "cubilia Curae; Pellentesque pulvinar augue at ultricies placerat. Vestibulum faucibus sem " +
                        "vel massa egestas consectetur at et nisi. Nullam consectetur, mi et lacinia commodo, arcu " +
                        "eros tempus risus, nec porta justo metus in orci. Pellentesque mattis tortor a ultrices " +
                        "pharetra. Phasellus tristique urna orci, ut vulputate tortor accumsan sit amet. Nulla sed " +
                        "nunc varius, finibus sapien eget, venenatis tortor. Nam gravida diam ut sapien sodales, ut " +
                        "sodales tellus feugiat. Duis auctor rutrum dictum. Phasellus facilisis, nibh at tempus " +
                        "efficitur, odio sem molestie lectus, at bibendum metus orci in nibh. Mauris facilisis est " +
                        "nibh, vitae iaculis risus lacinia at. Aliquam in lectus est.",
                "distribution-2",
                null,
                "http://example.com",
                "text/plain",
                repositoryUrl,
                dataset
        );
    }

    public DistributionMetadata distribution3(String repositoryUrl, DatasetMetadata dataset) {
        return metadataFactory.createDistributionMetadata(
                "Nice Distribution",
                "Maecenas et mollis purus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere " +
                        "cubilia Curae; Pellentesque pulvinar augue at ultricies placerat. Vestibulum faucibus sem " +
                        "vel massa egestas consectetur at et nisi. Nullam consectetur, mi et lacinia commodo, arcu " +
                        "eros tempus risus, nec porta justo metus in orci. Pellentesque mattis tortor a ultrices " +
                        "pharetra. Phasellus tristique urna orci, ut vulputate tortor accumsan sit amet. Nulla sed " +
                        "nunc varius, finibus sapien eget, venenatis tortor. Nam gravida diam ut sapien sodales, ut " +
                        "sodales tellus feugiat. Duis auctor rutrum dictum. Phasellus facilisis, nibh at tempus " +
                        "efficitur, odio sem molestie lectus, at bibendum metus orci in nibh. Mauris facilisis est " +
                        "nibh, vitae iaculis risus lacinia at. Aliquam in lectus est.",
                "distribution-3",
                null,
                "http://example.com",
                "text/plain",
                repositoryUrl,
                dataset
        );
    }

    public DataRecordMetadata datarecord1(String repositoryUrl, DatasetMetadata dataset) {
        return metadataFactory.createDatarecordMetadata(
                "My datarecord 1",
                "Maecenas et mollis purus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere " +
                        "cubilia Curae; Pellentesque pulvinar augue at ultricies placerat. Vestibulum faucibus sem " +
                        "vel massa egestas consectetur at et nisi. Nullam consectetur, mi et lacinia commodo, arcu " +
                        "eros tempus risus, nec porta justo metus in orci. Pellentesque mattis tortor a ultrices " +
                        "pharetra. Phasellus tristique urna orci, ut vulputate tortor accumsan sit amet. Nulla sed " +
                        "nunc varius, finibus sapien eget, venenatis tortor. Nam gravida diam ut sapien sodales, ut " +
                        "sodales tellus feugiat. Duis auctor rutrum dictum. Phasellus facilisis, nibh at tempus " +
                        "efficitur, odio sem molestie lectus, at bibendum metus orci in nibh. Mauris facilisis est " +
                        "nibh, vitae iaculis risus lacinia at. Aliquam in lectus est.",
                "datarecord-1",
                "https://git.lumc.nl/biosemantics/ring14-fdp-metadata/raw/bd01b84fb792ae3860fdda646e9cb96a1a11205c" +
                        "/rml/biobank/RING_14_biobank_mapping.ttl",
                "http://localhost.com/an-example-distribution",
                new Date(),
                new Date(),
                repositoryUrl,
                dataset
        );
    }

    public DataRecordMetadata datarecord2(String repositoryUrl, DatasetMetadata dataset) {
        return metadataFactory.createDatarecordMetadata(
                "My datarecord 2",
                "Maecenas et mollis purus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere " +
                        "cubilia Curae; Pellentesque pulvinar augue at ultricies placerat. Vestibulum faucibus sem " +
                        "vel massa egestas consectetur at et nisi. Nullam consectetur, mi et lacinia commodo, arcu " +
                        "eros tempus risus, nec porta justo metus in orci. Pellentesque mattis tortor a ultrices " +
                        "pharetra. Phasellus tristique urna orci, ut vulputate tortor accumsan sit amet. Nulla sed " +
                        "nunc varius, finibus sapien eget, venenatis tortor. Nam gravida diam ut sapien sodales, ut " +
                        "sodales tellus feugiat. Duis auctor rutrum dictum. Phasellus facilisis, nibh at tempus " +
                        "efficitur, odio sem molestie lectus, at bibendum metus orci in nibh. Mauris facilisis est " +
                        "nibh, vitae iaculis risus lacinia at. Aliquam in lectus est.",
                "datarecord-2",
                "https://git.lumc.nl/biosemantics/ring14-fdp-metadata/raw/bd01b84fb792ae3860fdda646e9cb96a1a11205c" +
                        "/rml/biobank/RING_14_biobank_mapping.ttl",
                "http://localhost.com/an-example-distribution",
                new Date(),
                new Date(),
                repositoryUrl,
                dataset
        );
    }

}
