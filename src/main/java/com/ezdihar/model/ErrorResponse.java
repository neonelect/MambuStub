package com.ezdihar.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorResponse {

    private String errorCode;
    private String errorSource;
    private String errorReason;

}
