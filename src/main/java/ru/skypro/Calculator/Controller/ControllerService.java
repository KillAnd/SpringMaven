package ru.skypro.Calculator.Controller;

import org.springframework.stereotype.Service;

@Service
public class ControllerService {

    public Integer plus(int num1, int num2) {
        return num1 + num2;
    }

    public Integer minus(int num1, int num2) {
        return num1 - num2;
    }

    public Integer multiply(int num1, int num2) {
        return num1 * num2;
    }

    public Integer divide(int num1, int num2) {
        return num1 / num2;
    }

}
