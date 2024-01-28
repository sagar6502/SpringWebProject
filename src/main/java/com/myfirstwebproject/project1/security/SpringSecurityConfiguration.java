package com.myfirstwebproject.project1.security;

import java.util.function.Function;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	//LDAP or Database
	//In Memory Configure
	
	//InMemoryUserDetailsManager(UserDetails... users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		/*
		 * It appears that you've declared a variable passwordEncoder of type Function<String, String>. This means that passwordEncoder is a functional interface in Java that represents a function that takes a String as input and produces another String as output.
		 */
		UserDetails userDetails = createNewUser("sagar", "sunar");
		UserDetails userDetails1 = createNewUser("prahladsaurag", "Lur@4321");
		//UserDetails userDetails = User.withDefaultPasswordEncoder().username("sagarsunar").password("Celeritas@13").roles("USER","ADMIN").build();
		return new InMemoryUserDetailsManager(userDetails, userDetails1);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> {
			return passwordEncoder().encode(input);
		};
		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder).username(username)
				.password(password).roles("USER","ADMIN").build();
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);
		http.formLogin(withDefaults());
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
}