package com.meanenglish.demoenglish.services;

import com.meanenglish.demoenglish.model.User;
import com.meanenglish.demoenglish.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User getUser() {
        return null;
    }
}
