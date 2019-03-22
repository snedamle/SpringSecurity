package com.broker.angelbroker.controller;

import com.broker.angelbroker.domain.User;
import com.broker.angelbroker.service.BrokingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by snehadamle on 14/02/19.
 */
@RestController
@RequestMapping("/angelbroking")
public class ResourceController {
    @Autowired
    private BrokingService userService;

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

    @RequestMapping(value ="/user/{id}", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('STANDARD_USER')")
    public User getByUsername(@PathVariable("id") String id){
        return userService.findByUsername(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('STANDARD_USER')")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}
