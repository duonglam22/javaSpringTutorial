package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    public WebSecurityConfig() {
        System.out.println("init WebSecurity object");
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        // Tạo ra user trong bộ nhớ
        // lưu ý, chỉ sử dụng cách này để minh họa
        // Còn thực tế chúng ta sẽ kiểm tra user trong csdl
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(
                User.withDefaultPasswordEncoder()
                .username("loda")
                .password("loda")
                .roles("USER")
                .build()
        );
        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "home").permitAll() // Cho phép tất cả mọi người truy cập vào 2 địa chỉ này
                .anyRequest().authenticated()   // Tất cả các request khác đều cần phải xác thực mới được truy cập
                .and()
             .formLogin()
                .defaultSuccessUrl("/hello")
                .permitAll()
                .and()
             .logout()
             .permitAll();
    }
}
