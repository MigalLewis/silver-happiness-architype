#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package};

import ${package}.model.${rootArtifactId};

public interface ${rootArtifactId}Module{

    public String sayHello();

    public void add${rootArtifactId}(${rootArtifactId} model);

    public void remove${rootArtifactId}(long id);

    public ${rootArtifactId} find${rootArtifactId}(long id);
    
    public ${rootArtifactId} edit${rootArtifactId}(${rootArtifactId} model);
}
