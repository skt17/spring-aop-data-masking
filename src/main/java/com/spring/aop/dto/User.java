package com.spring.aop.dto;

import com.spring.aop.aspect.Mask;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class User {

    private String userId;
    private String name;
    private String address;
    private String phoneNumber;

}
