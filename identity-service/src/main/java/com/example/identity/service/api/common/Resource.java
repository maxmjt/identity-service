package com.example.identity.service.api.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resource<T> extends AbstractResponse<DefaultMetadata> {

    private T content;
}
