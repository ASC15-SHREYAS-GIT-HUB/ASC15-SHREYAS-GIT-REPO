package com.practice.login.service;


import com.practice.login.repository.LoginRepository;
import com.practice.login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    private final LoginRepository loginRepo;
    @Autowired
    public LoginServiceImpl(LoginRepository loginRepo) {
        this.loginRepo = loginRepo;
    }


    @Override
    public boolean validLogin(Long id, String password) {
        return loginRepo.findById(id)
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }

}
