package com.metagxd.security.repository;

import com.metagxd.security.entity.User;

public interface UserRepository {

    User findByUsername(String username);
}
