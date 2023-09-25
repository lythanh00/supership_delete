package com.supership.ship.api;

import com.supership.ship.model.dto.UserDTO;
import com.supership.ship.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
//@RequestMapping("/user")
public class UserAPI {
    @Autowired
    private IUserService userService;

//    @GetMapping("/search")
//    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword", required = false, defaultValue = "") String name){
//        List<UserDTO> users = userService.searchUser(name);
//        return  ResponseEntity.ok(users);
//    }
//
//    @GetMapping("")
//    public ResponseEntity<?> getListUser(){
//        List<UserDTO> users = userService.getListUser();
//        return ResponseEntity.ok(users);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getUserById(@PathVariable int id){
//        UserDTO result = userService.getUserById(id);
//        return ResponseEntity.ok(result);
//    }

    @PostMapping("/user")
    public UserDTO createUser(@RequestBody UserDTO model){
        return model;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }
}
