package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.example.annotations.swagger.OkUserResponse;
import org.example.annotations.swagger.OkUsersResponse;
import org.example.annotations.swagger.UserBadRequest;
import org.example.annotations.swagger.UserNotFoundResponse;
import org.example.dto.UserDto;
import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Create user", description = "Creates a new user")
    @UserBadRequest //Кастомная аннотация для документации метода с не пройденной валидацией
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)//Код 201
    public UserDto saveUser(@Valid @RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @Operation(summary = "Get user by ID", description = "Returns a single user")
    @OkUserResponse //Кастомная аннотация для документации метода с успешной работой над User'ом
    @UserNotFoundResponse //Кастомная аннотация для документации метода с не найденным User'ом
    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

    @Operation(summary = "Get all users", description = "Returns all users")
    @OkUsersResponse //Кастомная аннотация для документации метода с успешной работой поиска всех User'ов
    @GetMapping
    public List<UserDto> findAllUsers(){
        return userService.findAllUsers();
    }

    @Operation(summary = "Update single user", description = "Updates user's information")
    @OkUserResponse
    @UserNotFoundResponse
    @UserBadRequest
    @PutMapping
    public UserDto updateUser(@Valid @RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @Operation(summary = "Delete user by Id", description = "Deletes single user")
    @UserNotFoundResponse
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)//Код 204
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
