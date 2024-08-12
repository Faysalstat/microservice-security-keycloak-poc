package com.assesment.securityservice.controller;


import com.assesment.securityservice.domain.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @GetMapping("/test")
    public ResponseEntity<ResponseDTO> apiTest(){
        return ResponseEntity.ok().body(new ResponseDTO("Security Service Running"));
    }
}
