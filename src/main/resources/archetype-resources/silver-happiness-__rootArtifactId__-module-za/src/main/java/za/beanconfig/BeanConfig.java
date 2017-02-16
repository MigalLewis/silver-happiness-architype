#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.za.beanconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;



@Configuration
@ComponentScan(basePackages = "${package}")
@Conditional(SouthAfrica.class)
public class BeanConfig {
  private static final Logger LOGGER = LoggerFactory.getLogger(BeanConfig.class);
   
}
