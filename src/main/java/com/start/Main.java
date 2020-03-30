package com.start;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        User user = new User();
        user.setName("Vasya");
        user.setAge(2);

        System.out.println(gson.toJson(user));
    }
}
