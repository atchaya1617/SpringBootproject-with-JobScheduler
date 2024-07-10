package com.example.Job.Sheduler.service;

import com.example.Job.Sheduler.entity.User;
import com.example.Job.Sheduler.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

//add object in db every 5 seconds
@Scheduled(fixedRate = 5000)
    public void add2DBJob(){
        User user = new User();
        user.setName("Admin"+new Random().nextInt(374483));
        userRepository.save(user);
        System.out.println("added object in database at: "+ new Date().toString());
    }

// fetch data from db every 15 seconds
 @Scheduled(cron = "0/15 * * * * *")
    public void fetchDBJob(){
        List<User> users = userRepository.findAll();
        System.out.println("fetch object from database at:"+ new Date(). toString());
        System.out.println("no of records:" +users.size());
        logger.info("Users: ()");
    }
}
