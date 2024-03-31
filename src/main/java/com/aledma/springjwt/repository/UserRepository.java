package com.aledma.springjwt.repository;

import com.aledma.springjwt.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
