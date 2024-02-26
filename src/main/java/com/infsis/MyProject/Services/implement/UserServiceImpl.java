package com.infsis.MyProject.Services.implement;

import com.infsis.MyProject.DTOs.UserDTO;
import com.infsis.MyProject.Models.User;
import com.infsis.MyProject.Services.UserService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<UserDTO> getUserById(Integer userId){
        return Optional.empty();
    }

    @Override
    public  UserDTO saveUser(UserDTO userDTO){
        return userDTO;
    }
    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO){
        return userDTO;
    }
    @Override
    public void delete(Integer userId){

    }
    private UserDTO UsertoDto(User user){
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return  userDTO;
    }
    private User DtoToUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        return user;
    }
}
