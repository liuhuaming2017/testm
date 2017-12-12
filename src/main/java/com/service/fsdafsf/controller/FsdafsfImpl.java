package com.service.fsdafsf.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-12T09:23:31.888Z")

@RestSchema(schemaId = "fsdafsf")
@RequestMapping(path = "/fsdafsf", produces = MediaType.APPLICATION_JSON)
public class FsdafsfImpl {

    @Autowired
    private FsdafsfDelegate userFsdafsfDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFsdafsfDelegate.helloworld(name);
    }

}
