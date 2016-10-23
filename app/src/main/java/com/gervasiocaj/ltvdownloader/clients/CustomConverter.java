package com.gervasiocaj.ltvdownloader.clients;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.Collections;

public class CustomConverter extends GsonHttpMessageConverter {

    public CustomConverter() {
        super();
        setSupportedMediaTypes(Collections.singletonList(MediaType.TEXT_HTML));
    }
}
