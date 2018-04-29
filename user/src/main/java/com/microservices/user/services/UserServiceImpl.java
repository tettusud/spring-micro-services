package com.microservices.user.services;


import com.microservices.common.exception.NotFoundException;
import com.microservices.user.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private static Map<String, UserModel> userMap;

    public UserServiceImpl() {
        userMap = new HashMap<>();
        userMap.put("1", new UserModel("1", "User-A", 10));
        userMap.put("2", new UserModel("2", "User-B", 20));
        userMap.put("3", new UserModel("3", "User-C", 30));
        userMap.put("4", new UserModel("4", "User-D", 40));
    }


    @Override
    public UserModel getUser(String userId) {
        return Optional.ofNullable(userMap.get(userId))
                .orElseThrow(() -> new NotFoundException("User " + userId + " not found in the system"));
    }

    @Override
    public List<UserModel> getUsers() {
        return Optional.ofNullable(userMap.keySet())
                .map(keys -> {
                    List<UserModel> users = new ArrayList<>();
                    for (String key : userMap.keySet()) {
                        users.add(userMap.get(key));
                    }
                    return users;
                })
                .orElseThrow(() -> new NotFoundException("User(s) not found in the system"));
    }


}
