package cz.zdenduk;

import cz.zdenduk.steps.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Step> steps = new ArrayList<>();
        steps.add(new PlusStep(1));
        steps.add(new DivideStep(2));
        steps.add(new MultiplyStep(3));
        steps.add(new MinusStep(8));

        Calculator calc = new Calculator(steps, 2, 1);
        /*calc.printTree();*/
        System.out.println(calc.solve(-15));
    }
}
