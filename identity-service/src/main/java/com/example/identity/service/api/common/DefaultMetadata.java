package com.example.identity.service.api.common;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Setter;

import java.util.Map;

/**
 * @author Max.Jimenez
 */
public class DefaultMetadata extends AbstractMetadata {

    @Setter
    private Map<String, Object> data;

    @JsonAnyGetter
    public Map<String, Object> getData() { return data; }
}
