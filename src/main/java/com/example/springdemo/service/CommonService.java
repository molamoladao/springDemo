package com.example.springdemo.service;

import com.example.springdemo.mapper.CommonMapper;
import com.example.springdemo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    CommonMapper CommonMapper;

    public String login(String sno,String password){
        return CommonMapper.login(sno,password);
    }

    public Student register(Student student){
        return CommonMapper.register(student);
    }
}
