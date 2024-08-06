package com.example.identity.service.api.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Max.Jimenez
 */
@Getter
@Setter
public class AbstractResponse<U extends  Metadata> {

    private U metadata;
}
