package com.example.userms.mappers;

import com.example.userms.dtos.UserDTOResponse;
import com.example.userms.entities.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDTOResponse fromUser(User user){
        UserDTOResponse userDTOResponse = new UserDTOResponse();
        BeanUtils.copyProperties(user,userDTOResponse);
        return userDTOResponse;
    }
}
