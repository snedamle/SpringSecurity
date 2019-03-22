package com.broker.angelbroker.repository;

import com.broker.angelbroker.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by snehadamle on 13/02/19.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
