package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

@FeignClient(name = "calculate", url = "158.160.132.56:8080/")
public interface Client {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    BigDecimal calculate(CalculationDto calculationDto);
}
