package com.exam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.app.entity.UserBean;

@Repository
public interface UserRepository extends JpaRepository<UserBean, Long>{
	
	 UserBean findByUsername(String username);
	
}
