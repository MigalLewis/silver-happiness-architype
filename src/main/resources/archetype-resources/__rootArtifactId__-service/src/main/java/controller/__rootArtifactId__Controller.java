#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;


import ${package}.${rootArtifactId}Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author migal
 */
@RestController(value="/rest/${rootArtifactId}")
public class ${rootArtifactId}Controller {

    @Autowired
    private ${rootArtifactId}Module module;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ApiOperation(value = "Says hello.")
    public String hello() {
        return module.sayHello();
    }

}
