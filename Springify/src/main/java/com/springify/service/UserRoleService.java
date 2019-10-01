package com.springify.service;

import com.springify.models.UserRole;
import org.springframework.stereotype.Service;

public interface UserRoleService {

    public UserRole createRole(UserRole newRole);

    public UserRole getRole(String roleName);
}