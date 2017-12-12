package com.service.testm.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-12T09:22:24.372Z")

@RestSchema(schemaId = "testm")
@RequestMapping(path = "/testm", produces = MediaType.APPLICATION_JSON)
public class TestmImpl {

    @Autowired
    private TestmDelegate userTestmDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestmDelegate.helloworld(name);
    }

}
