package com.example.pollsapplication.repository;

import com.example.pollsapplication.model.Role;
import com.example.pollsapplication.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long>
{
    Optional<Role> findByName(RoleName roleName);
}
