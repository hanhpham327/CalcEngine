package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        /* Below is not used due to class inheritances
//        this is one method
        MathEquation[] equations=new MathEquation[4];
//        mathequation[] is the syntax for creating equations (new object);
//        the [4] is array dimension, which has the 4 equations
        equations[0]= new MathEquation('d',100.0d,50.0d);
//        using the constructor to set up the object to the appropriate state
        equations[1]=new MathEquation('a',25.0d,92.0d);
        equations[2]=new MathEquation('s',225.0d,17.0d);
        equations[3]=new MathEquation('m',11.0d,3.0d);
        for(MathEquation equation:equations) {
//            equation is just  a variable
            equation.execute();

            System.out.print("result= ");
            System.out.println(equation.getResult());

        }

        System.out.println("overload below ");

        double testLeftVal=20;
        double testrightVal=40;
        int testLeftValInt=20;
        int testRightValInt=50;

        MathEquation overloadEquation=new MathEquation('d');
//        initialize
        overloadEquation.execute(testLeftVal,testrightVal);
//        call function in object
        System.out.println(overloadEquation.getResult());
//        print results
*/
        CalculateBase[] calculators= {
                new Subtracter(100.0d, 50.0d),
                new Adder(10.0d, 5.0d),
                new Multiplier(10.0d, 5.0d),
                new Divider(10.0d, 5.0d),

        };
        for (CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println(calculator.getResult());
        }

        }

}
