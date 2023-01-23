package com.example.kil.repository;

import com.example.kil.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users,Integer> {
    Users save(Users users);
    Users findUsersById(String userId);
}
