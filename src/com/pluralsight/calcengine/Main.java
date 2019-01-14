package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        String[] statements={
                "divide 100.0 50.",
                "multiply 11.0 3.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0"
        };

        CalculateHelper helper=new CalculateHelper();
        for(String inputStatement:statements){
            helper.process(inputStatement);
            System.out.println(helper.result);
            System.out.println(helper);

        }

    }

}
