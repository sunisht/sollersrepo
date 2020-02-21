/*
 * package com.ticketmanagement.test.service.users;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * 
 * import org.springframework.boot.test.context.TestConfiguration; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Primary; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * 
 * import com.ticketmanagement.domain.Person; import
 * com.ticketmanagement.domain.Role; import com.ticketmanagement.domain.User;
 * 
 * @TestConfiguration public class SpringSecurityWebAuxTestConfig {
 * 
 * @Bean
 * 
 * @Primary public UserDetailsService userDetailsService() { Role role = new
 * Role(1,"ROLE_SUPERVISOR"); Person person = new Person(); person.setId(2);
 * List<Role> roles = new ArrayList<Role>(); roles.add(role); User
 * supervisorUser = new User((Integer)1,"jj","1",true,person,roles); UserActive
 * managerActiveUser = new UserActive(supervisorUser, Arrays.asList( new
 * SimpleGrantedAuthority("ROLE_SUPERVISOR") ));
 * 
 * return new InMemoryUserDetailsManager(Arrays.asList( managerActiveUser )); }
 * }
 */