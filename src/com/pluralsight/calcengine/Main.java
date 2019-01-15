package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        String[] statements={
                "add 1.0",  //Error incorrect number of values
                "add xx 25.0", //Error non-numerica data
                "addX 0.0 0.0", //Error invalid command
                "divide 100.0 50.",
                "multiply 11.0 3.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0"
        };

        CalculateHelper helper=new CalculateHelper();
        for(String inputStatement:statements){
            try {
                helper.process(inputStatement);
                System.out.println(helper.result);
                System.out.println(helper);
            } catch(InvalidStatementException e) {
//                look at claculator helper as well as invalid statement exception
                System.out.println(e.getMessage());
                if(e.getCause()!=null)
                    System.out.println(" Original exception: " +e.getCause().getMessage());
            }
        }

    }

}
