package ru.skypro.Calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final ControllerService controllerService;

    public CalculatorController(ControllerService controllerService) {
        this.controllerService = controllerService;
    }



    @GetMapping
    public String welcome() {
        return "Добро пожаловать в эту жизнь";
    }

    @GetMapping("plus")
    public String plus(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Забыли указать число..";
        }

        return num1 + " + " + num2 + " = " + controllerService.plus(num1,num2);
    }

    @GetMapping("minus")
    public String minus(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Забыли указать число..";
        }

        return num1 + " - " + num2 + " = " + controllerService.minus(num1,num2);
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Забыли указать число..";
        }

        return num1 + " * " + num2 + " = " + controllerService.multiply(num1,num2);
    }

    @GetMapping("divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1  , @RequestParam(required = false, name = "num2") Integer num2) {

        if (num1 == null || num2 == null) {
            return "Забыли указать число..";
        }
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }

        return num1 + " / " + num2+ " = " + controllerService.divide(num1,num2);
    }

}
