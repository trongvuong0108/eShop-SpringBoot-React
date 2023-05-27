package com.code.Controller.Home;

import com.code.Data.ApplicationUser.Dto.Request.CreateUserRequest;
import com.code.Data.ApplicationUser.Dto.Request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody CreateUserRequest createUserRequest){
        return new ResponseEntity<>("OK",HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<?> login (@RequestBody LoginRequest loginRequest){
        return new ResponseEntity<>("OK",HttpStatus.OK);
    }
}
