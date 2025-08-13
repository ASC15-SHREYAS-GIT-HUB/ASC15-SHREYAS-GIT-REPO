package com.practice.login.repository;

import com.practice.login.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository  extends JpaRepository<LoginEntity, Long> {
}
