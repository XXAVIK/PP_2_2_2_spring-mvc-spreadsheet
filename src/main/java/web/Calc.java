package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.List;


public class Calc {
    private static final String Multiplication = "multiplication";
    private static final String Subtraction = "subtraction";
    private static final String Division = "division";
    private static final String Addition = "addition";

    private static int result;

    public static int getResult(int a, int b, String action) {
        int result1 = calculation(a, b, action);
        System.out.println(result1);
        return result1;

    }

    public static int calculation(int a, int b, String action) {
        if (action.toLowerCase().equals(Subtraction)){
            result = a - b;
        } else if (action.toLowerCase().equals(Addition)) {
            result = a + b;
        } else if (action.toLowerCase().equals(Multiplication)) {
            result = a * b;
        } else if (action.toLowerCase().equals(Division)) {
            result = a / b;
        }
        System.out.println(result);
        return result;
    }

    public static String getAddition() {
        return Addition;
    }

    public static String getDivision() {
        return Division;
    }

    public static String getMultiplication() {
        return Multiplication;
    }

    public static String getSubtraction() {
        return Subtraction;
    }
}
