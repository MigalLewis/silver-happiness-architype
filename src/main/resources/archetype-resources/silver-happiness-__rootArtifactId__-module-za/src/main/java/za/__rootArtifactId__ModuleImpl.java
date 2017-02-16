#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.za;

import ${package}.${rootArtifactId}Module;
import org.springframework.stereotype.Component;

@Component
public class ${rootArtifactId}ModuleImpl implements ${rootArtifactId}Module{

    @Override
    public String sayHello() {
        return "Hello from South Africa";
    }
    
}
