package com.uwhiz.user.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/", "/login**", "/webjars/**", "/api/v1/**").permitAll()
                .anyRequest().authenticated().and().logout().logoutSuccessUrl("/").permitAll().and()
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
        // @formatter:on
    }


}
