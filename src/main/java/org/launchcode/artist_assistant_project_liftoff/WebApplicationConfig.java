//package org.launchcode.artist_assistant_project_liftoff;
////
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
////import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
////
/////**
//// * Created by Chris Bay
//// */
////@Configuration
////public class WebApplicationConfig implements WebMvcConfigurer {
////
////    // Create spring-managed object to allow the app to access our filter
////    @Bean
////    public AuthenticationFilter authenticationFilter() {
////        return new AuthenticationFilter();
////    }
////
////    // Register the filter with the Spring container
////    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor( authenticationFilter() );
////    }
////
////}
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login")).and().authorizeRequests()
//                .antMatchers("/dashboard").hasRole("USER").and().formLogin().defaultSuccessUrl("/dashboard")
//                .loginPage("/login").and().logout().permitAll();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("john123").password("password").roles("USER");
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/*.css");
//        web.ignoring().antMatchers("/*.js");
//    }
//}