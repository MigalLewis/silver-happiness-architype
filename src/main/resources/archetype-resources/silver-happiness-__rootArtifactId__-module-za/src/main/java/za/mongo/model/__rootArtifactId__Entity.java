#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.za.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
/**
 *
 * @author migal
 */
@Data
public class ${rootArtifactId}Entity {
  @Id
  private long id;
}
