package com.broker.angelbroker.service;

import com.broker.angelbroker.domain.User;

import java.util.List;

public interface BrokingService {
    User findByUsername(String username);

    List<User> findAllUsers();

    User update(User user);
}
