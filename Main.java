package com.nasir.lab;

import static com.nasir.lab.BalancedBrakets.areBracketsBalanced;

public class Main {
    //Driver code
    public static void main(String[] args)
    {
        String expr = "[[{}]]";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("The entered String has Balanced Brackets ");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets ");
    }
}


