package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int result1 = calculator.addAtoB(4,4);
        if (result1 == 8) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
        int result2 = calculator.subtractAFromB(8,14);
        if (result2 == 6) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
    }
}
