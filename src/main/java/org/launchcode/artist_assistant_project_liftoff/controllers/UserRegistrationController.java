package org.launchcode.artist_assistant_project_liftoff.controllers;

import org.launchcode.artist_assistant_project_liftoff.model.service.UserRegistrationDto;
import org.launchcode.artist_assistant_project_liftoff.model.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService){
    super();
    this.userService = userService;
}
public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
    userService.save(registrationDto);
    return "redirect:/regisratrion? success";
}
}
