package com.example.proyectot3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
    
    @Bean
    public InMemoryUserDetailsManager configureAuthentication(){

        List<UserDetails> listaUsuarios = new ArrayList<>();
        List<GrantedAuthority> rolesClientes = new ArrayList<>();
        List<GrantedAuthority> rolesAdministradores = new ArrayList<>();

        rolesClientes.add(new SimpleGrantedAuthority("USER"));
        rolesAdministradores.add(new SimpleGrantedAuthority("ADMIN"));
        listaUsuarios.add(new User("Administrador","{noop}123456",rolesAdministradores));
        listaUsuarios.add(new User("Andy","{noop}123456",rolesClientes));
        listaUsuarios.add(new User("Enzo","{noop}123456",rolesClientes));
        listaUsuarios.add(new User("Jose","{noop}123456",rolesClientes));

        return new InMemoryUserDetailsManager(listaUsuarios);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
        .antMatchers("/").permitAll()
        .antMatchers("/nosotros/").permitAll()
        .antMatchers("/preguntas/").permitAll()
        .antMatchers("/servicios/rayosx").permitAll()
        .antMatchers("/servicios/examenMedico").permitAll()
        .antMatchers("/servicios//rayosx/agendar").permitAll()
        .antMatchers("/servicios/examenMedico/agendar").permitAll()
        .anyRequest().authenticated()
        .and().formLogin().loginPage("/autenticacion").defaultSuccessUrl("/panel", true).permitAll()
        .and().logout().permitAll();
        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() throws Exception{
        return (web) -> web.ignoring().antMatchers("/css/**", "/js/**", "/audio/**", "/assets/**", "/Dashboard/**", "/imag/**");
    }
}
