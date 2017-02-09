#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.za.beanconfig;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SouthAfrica implements Condition {

    public static final String COUNTRY_CODE = "ZA";

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String countryCode = conditionContext.getEnvironment().getProperty("country.code");
        return COUNTRY_CODE.equals(countryCode);
    }
}
