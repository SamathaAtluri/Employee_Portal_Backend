
package com.vcube.EmployeePortal.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.EmployeePortal.model.AuthUser;

public interface AuthUserRepository
        extends JpaRepository<AuthUser, Integer> {

    Optional<AuthUser> findByUsername(String username);
}
