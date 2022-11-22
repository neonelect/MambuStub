package com.ezdihar.controller;

import com.ezdihar.model.ErrorResponse;
import org.springframework.web.bind.annotation.*;

public abstract class BasicController<T_REQ> {

    private static final String DEFAULT_MESSAGE = "Endpoint response OK";

    @GetMapping("/{id}")
    public String getMethod(@PathVariable final String id) {
        return DEFAULT_MESSAGE;
    }

    @GetMapping
    public String getAllMethod() {
        return DEFAULT_MESSAGE;
    }

    @PostMapping
    public String postMethod(@RequestBody final T_REQ req) {
        return DEFAULT_MESSAGE;
    }

    @PatchMapping("/{id}")
    public String patchMethod(@PathVariable final String id, @RequestBody final T_REQ req) {
        return DEFAULT_MESSAGE;
    }

    @PutMapping("/{id}")
    public T_REQ putMethod(@PathVariable final String id, @RequestBody final T_REQ req) {
        return req;
    }

    @DeleteMapping("/{id}")
    public String deleteMethod(@PathVariable final String id, @RequestBody final T_REQ req) {
        return DEFAULT_MESSAGE;
    }

    @GetMapping("/error")
    public ErrorResponse getError() {
        return ErrorResponse.builder()
                .errorCode("3")
                .errorReason("some reason")
                .errorSource("source of error")
                .build();
    }
}
