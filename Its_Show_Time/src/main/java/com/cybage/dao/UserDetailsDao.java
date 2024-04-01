package com.cybage.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cybage.entity.UserDetailsEntity;

public interface UserDetailsDao extends JpaRepository<UserDetailsEntity, Integer> {
	Optional<UserDetailsEntity> findByUserName(String username);
}
