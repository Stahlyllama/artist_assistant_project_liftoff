package org.launchcode.artist_assistant_project_liftoff.controllers;

import org.launchcode.artist_assistant_project_liftoff.user.User;
import org.launchcode.artist_assistant_project_liftoff.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

@Controller
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;

    public User getUserFromSession(HttpSession session) {

        return null;
    }
}