package com.example.client;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculationDto {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private char operation;
}
