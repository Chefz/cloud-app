package com.example.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Slf4j
public class Calculator {
    private final Client client;

    @Scheduled(cron = "0 * * * * *")
    public void calculate() {
        CalculationDto calculationDto = new CalculationDto();
        calculationDto.setOperation('*');
        calculationDto.setFirstOperand(BigDecimal.valueOf(3L));
        calculationDto.setSecondOperand(BigDecimal.valueOf(4L));
        log.info(client.calculate(calculationDto).toString());
    }
}
