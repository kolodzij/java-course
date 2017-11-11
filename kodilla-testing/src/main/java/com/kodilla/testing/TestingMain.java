package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result =simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test ok");
        }
        else
            System.out.println("Error!");


        Calculator calculator = new Calculator();

        int addFunctionResult=calculator.add(13,15);
        int substractFunctionResult=calculator.substract(56,23);

        if (addFunctionResult==13+15)
            System.out.println("test ok");
        else
            System.out.println("Error!");

        if (substractFunctionResult==56-23)
            System.out.println("test ok");
        else
            System.out.println("Error!");
    }
}