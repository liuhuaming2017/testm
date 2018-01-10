package com.service.liuhuaming.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-10T11:08:47.709Z")

@RestSchema(schemaId = "liuhuaming")
@RequestMapping(path = "/liuhuaming", produces = MediaType.APPLICATION_JSON)
public class LiuhuamingImpl {

    @Autowired
    private LiuhuamingDelegate userLiuhuamingDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLiuhuamingDelegate.helloworld(name);
    }

}
