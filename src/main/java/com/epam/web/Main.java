package com.epam.web;

import com.epam.tasks.CalculationLogic;
public class Main {
    public static void main(String[] args) {
        CalculationLogic systemLogic = new CalculationLogic();
        SystemInput systemInput = new SystemInput();
        systemLogic.calc(systemInput.input());
    }
}
