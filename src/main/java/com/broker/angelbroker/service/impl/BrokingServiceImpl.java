package com.broker.angelbroker.service.impl;

import com.broker.angelbroker.domain.User;
import com.broker.angelbroker.repository.UserRepository;
import com.broker.angelbroker.service.BrokingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrokingServiceImpl implements BrokingService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public User update(User user) {
        User u = userRepository.findByUsername(user.getUsername());
        u.setFirstName(user.getFirstName());
        u.setLastName(user.getLastName());
        u.setAddress(user.getAddress());
        u.setEmail(user.getEmail());
        u.setFatherName(user.getFatherName());
        u.setGender(user.getGender());
        u.setMotherName(user.getMotherName());
        u.setMaritalStatus(user.getMaritalStatus());
        u.setMaidenName(user.getMaidenName());
       return userRepository.save(u);
    }
}
