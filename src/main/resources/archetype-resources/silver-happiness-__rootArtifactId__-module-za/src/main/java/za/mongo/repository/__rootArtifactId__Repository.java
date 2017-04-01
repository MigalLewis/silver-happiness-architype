#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.za.mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.migal.home.za.mongo.model.${rootArtifactId}Entity;
/**
 *
 * @author migal
 */
public interface ${rootArtifactId}Repository extends MongoRepository<${rootArtifactId}Entity, String>{
    /**
   * 
   * @param id
   * @return 
   */
  public ${rootArtifactId}Entity findById(long id);
}
