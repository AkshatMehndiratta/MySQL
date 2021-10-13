package com.example.demo.controllers;

import com.example.demo.DAOs.Person;
import com.example.demo.DBManager.DBOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @RequestMapping(value = "/getperson", method = RequestMethod.GET)
        public List<Person> getpersons(){

        // Calling dao to get object from db

        return DBOperations.getPersons();
    }

}
