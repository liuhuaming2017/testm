package com.service.cpts.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-28T03:50:54.506Z")

@RestSchema(schemaId = "cpts")
@RequestMapping(path = "/cpts", produces = MediaType.APPLICATION_JSON)
public class CptsImpl {

    @Autowired
    private CptsDelegate userCptsDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCptsDelegate.helloworld(name);
    }

}
