package com.metagxd.security.repository;

import com.metagxd.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserMockRepository implements UserRepository {
    Map<String, User> users = new HashMap<>();

    public UserMockRepository() {
    }

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostConstruct
    public void init() {
        users.put("user", new User("user", bCryptPasswordEncoder.encode("111111")));
    }


    public User findByUsername(String username) {
        return users.get(username);
    }
}
