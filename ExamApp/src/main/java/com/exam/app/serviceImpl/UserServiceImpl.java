package com.exam.app.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exam.app.entity.ApplicationUserDetails;
import com.exam.app.entity.UserBean;
import com.exam.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Transactional
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserBean userDetails = null ;
		try {
			if (!username.isEmpty() || !username.endsWith("")) {
				userDetails = userRepository.findByUsername(username);
				if(userDetails==null) throw new UsernameNotFoundException("User not found!");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ApplicationUserDetails(userDetails);
	}

}
