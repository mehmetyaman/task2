package com.codefirstio.codefirsthelloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class userController {
    @Autowired private com.codefirstio.codefirsthelloworld.userRepository userRepository;

    @PostMapping("/signup")
    public user signup(@RequestBody user client){
        user create= userRepository.save(client);
        return  create;
    }
    @GetMapping("hello")
    public String HelloW(){
        return "Hello World";
    }
}
