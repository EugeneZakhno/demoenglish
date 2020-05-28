package com.meanenglish.demoenglish.services;

import com.meanenglish.demoenglish.model.User;
import com.meanenglish.demoenglish.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser() {
        return null;
    }
}
