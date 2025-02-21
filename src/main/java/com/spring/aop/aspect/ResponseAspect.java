package com.spring.aop.aspect;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Aspect
@Component
public class ResponseAspect {

    private static List<String> PII_DATA_KEYWORD= Arrays.asList("phonenumber","address","cardid","cvv");

    private static String MASK_STAR="******";

    @Around("@annotation(com.spring.aop.aspect.Mask)")
    public Object maskedData(ProceedingJoinPoint joinPoint) throws Throwable {
        ObjectMapper objectMapper=new ObjectMapper();
        Object resp=joinPoint.proceed();
        Map<String,String> respData=  objectMapper.convertValue(resp, new TypeReference<Map<String,String>>() {
        });

        respData.forEach((key,value)->{
                if(PII_DATA_KEYWORD.contains(key.toLowerCase()))
                {
                    String maskValue=MASK_STAR.concat(value.substring((int) ((int)Math.floor(value.length()-1)*0.7)));
                    respData.put(key,maskValue);
                    System.out.println("PII data found and has been masked successfully");
                }
        });

        return objectMapper.convertValue(respData,resp.getClass());
    }

}
