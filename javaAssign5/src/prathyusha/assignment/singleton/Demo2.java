package prathyusha.assignment.singleton;

public class Demo2 {

    String x;

    public static Demo2 initializeVar(String a)
    {
        //non-static fields cannot be referenced from a static context
       //x = a;

        Demo2 obj = new Demo2();
        obj.x = a;
        return obj;
    }

    public void printString()
    {
        System.out.println("In non-static method,printString: " + x);
    }

}
