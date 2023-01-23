package com.example.kil.service;

import com.example.kil.entity.Status;
import com.example.kil.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;
    public Status submitDataToDb(Status status){

        return statusRepo.save(status );
    }
    public ArrayList<Status>retriveStatus(){
        return statusRepo.findAll();

    }

}
