package com.amela.service;

import com.amela.model.User;
import com.amela.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;



    public User findByUsernameAndPassword(String username, String password){
        User user = userRepository.findByUsernameAndPassword(username,password);
        return user;
    }

    @Override
    public List findAll() {
        return userRepository.findAll();
    }
}
