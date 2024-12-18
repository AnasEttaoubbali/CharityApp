package com.example.userms.dtos;

import com.example.userms.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOResponse {
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private String CIN;
    private String phoneNumber;
    private String address;
    private Gender gender;
    private Boolean enabled;
}
