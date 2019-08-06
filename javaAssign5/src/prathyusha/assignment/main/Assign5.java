package prathyusha.assignment.main;

import prathyusha.assignment.data.Demo;
import prathyusha.assignment.singleton.Demo2;

public class Assign5 {

    public static void main(String args[])
    {
        Demo demo = new Demo();

        demo.printInstanceVariables();
        demo.printLocalVariables();

        Demo2 obj = Demo2.initializeVar("Hello");
        obj.printString();

    }
}
