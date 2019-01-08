package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        this is one method
        MathEquation[] equations=new MathEquation[4];
//        mathequation[] is the syntax for creating equations (new object);
//        the [4] is array dimension, which has the 4 equations
        equations[0]=create(100.0d,50.0d,'d');
        equations[1]=create(25.0d,92.0d,'a');
        equations[2]=create(225.0d,17.0d,'s');
        equations[3]=create(11.0d,3.0d,'m');
        for(MathEquation equation:equations) {
//            equation is just  a variable
            equation.execute();

            System.out.print("result= ");
            System.out.println(equation.getResult());

        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode){
//        returns a new instance of mathequation
//        another methhod called create
        MathEquation equation= new MathEquation();
//        create new instance of mathequation
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;

    }
}
