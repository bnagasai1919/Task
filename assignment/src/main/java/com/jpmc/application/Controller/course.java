package com.jpmc.application.Controller;
import java.util.List;

import com.jpmc.application.Entity.ECourse;
import com.jpmc.application.Services.Cservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("course")
public class course
 {

    @Autowired
    private Cservice courseService;


    @PostMapping(value="/saveCourse",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ECourse> saveCourse(@RequestBody ECourse course){
        courseService.save(course);

        return new ResponseEntity<ECourse>(course,HttpStatus.OK);
    }


    @GetMapping(value="/myCourse",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ECourse>> getCourses(){

        List<ECourse> courses= courseService.getCourses();

        return new ResponseEntity<List<ECourse>>(courses,HttpStatus.OK);
    }
    
}
