package org.launchcode.artist_assistant_project_liftoff.model.service;

import org.launchcode.artist_assistant_project_liftoff.model.User;
import org.launchcode.artist_assistant_project_liftoff.model.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(),
                Arrays.asList(NewRole("ROLE_USER")));
        return userRepository.save(user);
    }

    private Object NewRole(String role_user) {
        return null;
    }
}