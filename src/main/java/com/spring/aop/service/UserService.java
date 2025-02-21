package com.spring.aop.service;

import com.spring.aop.aspect.Mask;
import com.spring.aop.dto.Card;
import com.spring.aop.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Mask
    public User getUserInfo() {
        User user = new User("12345", "Alex", "7th street 2nd cross road Sydney Australia", "+619234568893");

        return user;
    }

    @Mask
    public Card getCardDetails() {
        Card card = new Card("123-44-55-66", "HSBC", "123", "Alex Carry");
        return card;
    }

}
