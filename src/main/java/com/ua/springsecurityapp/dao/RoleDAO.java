package com.ua.springsecurityapp.dao;

import com.ua.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role, Long> {
}
