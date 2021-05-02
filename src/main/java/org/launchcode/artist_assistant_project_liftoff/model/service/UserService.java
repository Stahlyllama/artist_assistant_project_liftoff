package org.launchcode.artist_assistant_project_liftoff.model.service;

import org.launchcode.artist_assistant_project_liftoff.model.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
