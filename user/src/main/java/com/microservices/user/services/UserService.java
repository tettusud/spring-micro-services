package com.microservices.user.services;

import com.microservices.user.models.UserModel;

import java.util.List;

public interface UserService {

    /**
     *
     * @param userId
     * @return
     */
    public UserModel getUser(String userId);

    public List<UserModel> getUsers();
}
