package com.springify.controller;

import com.springify.models.UserRole;
import com.springify.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class UserRoleController {

    @Autowired
    UserRoleService roleService;

    @GetMapping("/{roleName}")
    public UserRole getRole(@PathVariable String roleName) {
        return roleService.getRole(roleName);
    }

    @PostMapping
    public UserRole createRole(@RequestBody UserRole role) {
        return roleService.createRole(role);
    }

}
