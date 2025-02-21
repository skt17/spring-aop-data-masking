package com.spring.aop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    String cardId;
    String bankName;
    String cvv;
    String name;
}
