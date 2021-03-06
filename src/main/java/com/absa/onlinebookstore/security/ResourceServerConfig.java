/*package com.absa.onlinebookstore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@Configuration
public class ResourceServerConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private AuthenticationManager authenticationManager;

    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
        .antMatchers("/books")
        .and()
        .authorizeRequests()
        .anyRequest()
        .authenticated();
  }

  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth.parentAuthenticationManager(authenticationManager)
      .inMemoryAuthentication()
      .withUser("Chaitra")
      .password("chaitra")
      .roles("ADMIN");
  }

}*/
