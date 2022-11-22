package com.ezdihar.controller;

import com.ezdihar.model.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BasicController<User> {
}
