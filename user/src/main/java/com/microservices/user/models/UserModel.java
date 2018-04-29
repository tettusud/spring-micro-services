package com.microservices.user.models;


/***
 *
 */
public class UserModel {

    private String userId;
    private String userName;
    private int age;

    public UserModel(String userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }
}
