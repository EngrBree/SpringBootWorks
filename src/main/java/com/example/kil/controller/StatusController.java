package com.example.kil.controller;


import com.example.kil.entity.Status;
import com.example.kil.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusService statusService;

        @PostMapping("")
    private Status submitStatus(@RequestBody Status status){

            return statusService.submitDataToDb(status);
    }
    @GetMapping("/status")
    private ArrayList<Status>getAllStatus(){
        return statusService.retriveStatus();

    }
}
