package com.service.cptstest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-28T03:35:09.488Z")

@RestSchema(schemaId = "cptstest")
@RequestMapping(path = "/cptstest", produces = MediaType.APPLICATION_JSON)
public class CptstestImpl {

    @Autowired
    private CptstestDelegate userCptstestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCptstestDelegate.helloworld(name);
    }

}
