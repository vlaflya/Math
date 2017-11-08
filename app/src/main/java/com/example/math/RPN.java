package com.example.math;

/**
 * Created by Роман on 04.11.2017.
 */

public class RPN {
    public double Calculate(String input){
        return 1;
    }
    private String GetExp(String input){


        return "o";
    }


    static private boolean IsOperator(String сh)
    {
        if(сh.equals("+")) return true;
        if(сh.equals("-")) return true;
        if(сh.equals("*")) return true;
        if(сh.equals("/")) return true;
        if(сh.equals("sqrt")) return true;
        if(сh.equals("^")) return true;
        if(сh.equals("(")) return true;
        if(сh.equals(")")) return true;
        if(сh.equals("/")) return true;
        if(сh.equals("ln")) return true;
        if(сh.equals("lg")) return true;
        if(сh.equals("cos")) return true;
        if(сh.equals("sin")) return true;
        if(сh.equals("tan")) return true;
        if(сh.equals("ctan")) return true;
        if(сh.equals("pi")) return true;

        return false;
    }
    static private byte GetPriority(String s)
    {
        switch (s)
        {
            case "(": return 0;
            case ")": return 1;
            case "+": return 2;
            case "-": return 3;
            case "*": return 4;
            case "/": return 4;
            case "^": return 5;
            case "sin": return 6;
            case "cos": return 7;
            case "tan": return 8;
            case "ctan":return 9;
            case "ln":return 10;
            case "lg":return 11;
            case "pi":return 12;
            default: return 13;
        }

    }

}
