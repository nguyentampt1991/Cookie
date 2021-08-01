package com.amela.service;

import com.amela.model.User;

import java.util.List;

public interface IUserService {
    User findByUsernameAndPassword(String username, String password);
    List findAll();
}
