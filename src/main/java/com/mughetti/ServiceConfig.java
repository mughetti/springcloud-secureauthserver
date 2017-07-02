package com.mughetti;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        
        auth.inMemoryAuthentication()
        .withUser("marco").password("password").roles("USER").and()
        .withUser("eva").password("password").roles("USER", "OPERATOR");
        
    }

}
