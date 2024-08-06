package com.example.identity.service.api.common.factory;

import com.example.identity.service.api.common.Resource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Max.Jimenez
 */
public class ResourceBuilder {

    private static final  String STATUS = "successful";

    private static final  String EMPTY_CONTENT = "successful";

    private Integer code;

    private String message;

    private String resourceKey;

    public static ResourceBuilder getInstance() {
        return new ResourceBuilder();
    }

    private ResourceBuilder() {

    }

    public ResourceBuilder setCode(Integer code) {
        if (code != null) {
            this.code = code;
        }

        return this;
    }

    public ResourceBuilder setMessage(String message) {
        if (!(message == null || message.isBlank())) {
            this.message = message;
        }

        return this;
    }

    public ResourceBuilder setResourceKey(String resourceKey) {
        if (!(resourceKey == null || resourceKey.isBlank())) {
            this.resourceKey = resourceKey;
        }

        return this;
    }

    public <T> Resource<T> build(T content) {
        Map<String, Object> data = new HashMap<>();
        data.put("status", STATUS);

        if (null != code) {
            data.put("code", code);
        }

        if (!(message == null || message.isBlank())) {
            data.put("message", message);
        }

        if (!(resourceKey == null || resourceKey.isBlank())) {
            data.put("resourceKey", resourceKey);
        }

        ResourceFactory<T> factory = new ResourceFactory<>(content);
        factory.setData(data);

        return factory.create();
    }

}
