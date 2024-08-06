package com.example.identity.service.api.common.factory;

import com.example.identity.service.api.common.AbstractResponse;
import com.example.identity.service.api.common.Metadata;

/**
 * @author Max.Jimenez
 */
abstract class AbstractResponseFactory<U extends AbstractResponse<V>, V extends Metadata> {

    public U create() {
        U instance = createInstance();
        V metadataInstance = createMetadataInstance();

        instance.setMetadata(metadataInstance);

        return instance;
    }

    protected abstract U createInstance();

    protected abstract V createMetadataInstance();
}
