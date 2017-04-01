#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ${package}.${rootArtifactId}Module;
import ${package}.model.${rootArtifactId};

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author migal
 */
@RestController
@RequestMapping(path = "/rest/${rootArtifactId}", produces = "application/json" )
public class ${rootArtifactId}Controller {

    @Autowired
    private ${rootArtifactId}Module module;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ApiOperation(value = "Says hello.")
    public String hello() {
        return module.sayHello();
    }
    /**
    *
    * @param id
    * @return
    */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Finds ${rootArtifactId} by id")
    @ResponseBody
    public ${rootArtifactId} find${rootArtifactId}(@PathVariable long id) {
      return module.find${rootArtifactId}(id);
    }
   /**
    *
    * @param request
    */
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Adds a ${rootArtifactId}")
    @ResponseBody
    public void add${rootArtifactId}(@RequestBody ${rootArtifactId} request){
      module.add${rootArtifactId}(request);
    }
   /**
    *
    * @param id
    */
    @RequestMapping(method = RequestMethod.DELETE , value = "/{id}")
    @ApiOperation(value = "Removes an ${rootArtifactId}")
    public void delete${rootArtifactId}(@PathVariable long id){
      module.remove${rootArtifactId}(id);
    }
    /**
    *
    * @param request
    * @return
    */
    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "edits a ${rootArtifactId}")
    @ResponseBody
    public ${rootArtifactId} update${rootArtifactId}(@RequestBody ${rootArtifactId} request){
      return module.edit${rootArtifactId}(request);
    }


}
