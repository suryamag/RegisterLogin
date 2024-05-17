package com.employee.RegisterLogin.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.employee.RegisterLogin.entity.UserDetails;


@EnableJpaRepositories
@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {
	
	Optional<UserDetails> findOneByEmailAndPassword(String email, String password);
	
	UserDetails findByEmail(String email);

}
