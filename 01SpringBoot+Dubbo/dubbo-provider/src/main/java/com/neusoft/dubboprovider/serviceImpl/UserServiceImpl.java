package com.neusoft.dubboprovider.serviceImpl;

import com.neusoft.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getName(int id) {
        switch (id){
            case 1:
                return "王宁";
            case 2:
                return "马云";
            case 3:
                return "刘强东";
                default:
                    return "";
        }
    }

    @Override
    public int getAge(int id) {
        return id;
    }
}
