package com.example.post.post.controller;

import com.example.post.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){

        System.out.println(requestData.toString());

    }

    @PostMapping("/post-mapping")
    public void postMapping(@RequestBody Map<String,Object> request){
        request.forEach((key, value) -> {
            System.out.print("key : " + key);
            System.out.println(", value : " + value);
        });
    }

}
