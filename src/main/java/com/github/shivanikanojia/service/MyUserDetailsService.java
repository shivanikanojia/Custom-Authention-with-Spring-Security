package com.github.shivanikanojia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.github.shivanikanojia.model.Users;
import com.github.shivanikanojia.principal.UserPrincipal;
import com.github.shivanikanojia.repository.userRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private userRepo userRepo;
	
	@Secured("ROLE_ADMIN")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = userRepo.findByUsername(username);
		if(null == user)
			throw new UsernameNotFoundException("No User Found");
		return new UserPrincipal(user);
	}

}
