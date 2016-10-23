package com.gervasiocaj.ltvdownloader.clients;

import com.gervasiocaj.ltvdownloader.models.SearchResult;

import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = "http://legendas.tv", converters = {CustomConverter.class})
public interface LegendasSearchClient {

    @Get("/legenda/sugestao/{query}")
    List<SearchResult> search(@Path String query);

}
