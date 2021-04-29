package org.launchcode.artist_assistant_project_liftoff.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {
    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello Spring";
    }
}
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
//import java.util.List;
//@RestController
//public class UserController {
//    @Autowired
//    UserRepository userRepository;
//    @PostMapping("/users/register")
//    public Status registerUser(@Valid @RequestBody User newUser) {
//        List<User> users = userRepository.findAll();
//        System.out.println("New user: " + newUser.toString());
//        for (User user : users) {
//            System.out.println("Registered user: " + newUser.toString());
//            if (user.equals(newUser)) {
//                System.out.println("User Already exists!");
//                return Status.USER_ALREADY_EXISTS;
//            }
//        }
//        userRepository.save(newUser);
//        return Status.SUCCESS;
//    }
//    @PostMapping("/users/login")
//    public Status loginUser(@Valid @RequestBody User user) {
//        List<User> users = userRepository.findAll();
//        for (User other : users) {
//            if (other.equals(user)) {
//                user.setLoggedIn(true);
//                userRepository.save(user);
//                return Status.SUCCESS;
//            }
//        }
//        return Status.FAILURE;
//    }
//    @PostMapping("/users/logout")
//    public Status logUserOut(@Valid @RequestBody User user) {
//        List<User> users = userRepository.findAll();
//        for (User other : users) {
//            if (other.equals(user)) {
//                user.setLoggedIn(false);
//                userRepository.save(user);
//                return Status.SUCCESS;
//            }
//        }
//        return Status.FAILURE;
//    }
//    @DeleteMapping("/users/all")
//    public Status deleteUsers() {
//        userRepository.deleteAll();
//        return Status.SUCCESS;
//    }
//}