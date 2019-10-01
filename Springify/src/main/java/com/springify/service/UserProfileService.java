package com.springify.service;

import com.springify.models.UserProfile;
import org.springframework.stereotype.Service;


public interface UserProfileService {

    public UserProfile createUserProfile(String username, UserProfile newProfile);

    public UserProfile getUserProfile(String username);
}
