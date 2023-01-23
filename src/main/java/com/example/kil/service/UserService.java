package com.example.kil.service;


import com.example.kil.entity.Users;
import com.example.kil.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public Users submitMetaDataOfUser(Users users){
       return userRepo.save(users);


    }
    public Users displayUserMetaData(String userId){
      return   userRepo.findUsersById(userId);

    }
}
