#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.za;

import ${package}.${rootArtifactId}Module;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.za.mongo.util.${rootArtifactId}Mapper;
import ${package}.za.mongo.repository.${rootArtifactId}Repository;
import ${package}.model.${rootArtifactId};


@Component
public class ${rootArtifactId}ModuleImpl implements ${rootArtifactId}Module{

    private ${rootArtifactId}Mapper mapper;
    private ${rootArtifactId}Repository repository;

    @Override
    public String sayHello() {
        return "Hello from South Africa";
    }
    @Override
    public void add${rootArtifactId}(${rootArtifactId} model){
      repository.save(mapper.map(model));
    }
    @Autowired
    public void setMapper(${rootArtifactId}Mapper mapper){
      this.mapper=mapper;
    }
    @Autowired
    public void setRepository(${rootArtifactId}Repository repository){
      this.repository=repository;
    }
}
