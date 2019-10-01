package com.springify.service;

import com.springify.models.UserRole;
import org.springframework.stereotype.Service;
import com.springify.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User getUser(String username);

    public Iterable<User> listUsers();

    public String createUser(User newUser);

    public User login(String username, String password);

    public HttpStatus deleteById(Long userId);

    public User addSong(String title, int songId);

    public String login(User user);

}