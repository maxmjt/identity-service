package com.example.identity.service.api.common.factory;

import com.example.identity.service.api.common.DefaultMetadata;
import com.example.identity.service.api.common.Resource;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Max.Jimenez
 */
public class ResourceFactory<T> extends AbstractResponseFactory<Resource<T>, DefaultMetadata> {

    private T content;

    @Setter
    private Map<String, Object> data;

    public ResourceFactory(T content) {
        this.content = content;
    }

    @Override
    protected Resource<T> createInstance() {
        Resource<T> instance = new Resource<>();
        instance.setContent(content);

        return instance;
    }

    @Override
    protected DefaultMetadata createMetadataInstance() {
        if (null == data) {
            data = new HashMap<>();
        }

        DefaultMetadata instance = new DefaultMetadata();
        instance.setData(data);

        return instance;
    }
}
