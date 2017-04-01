#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.za.mongo.util;


import za.co.migal.home.za.mongo.model.${rootArtifactId}Entity;
import za.co.migal.home.model.${rootArtifactId};
/**
 *
 * @author migal
 */
public class ${rootArtifactId}Mapper{
    /**
   * 
   * @param input${rootArtifactId}
   * @return 
   */
  public ${rootArtifactId}Entity map(${rootArtifactId} input${rootArtifactId}){
    ${rootArtifactId}Entity output${rootArtifactId} = new ${rootArtifactId}Entity();
    output${rootArtifactId}.setId(input${rootArtifactId}.getId());
    return output${rootArtifactId};
  }
    /**
   * 
   * @param input${rootArtifactId}
   * @return 
   */
  public ${rootArtifactId} map(${rootArtifactId}Entity input${rootArtifactId}){
    ${rootArtifactId} output${rootArtifactId} = new ${rootArtifactId}();
    output${rootArtifactId}.setId(input${rootArtifactId}.getId());
    return output${rootArtifactId};
  }
}
