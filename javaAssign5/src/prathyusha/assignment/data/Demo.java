package prathyusha.assignment.data;

public class Demo {

    int a;
    char b;

    public void printInstanceVariables()
    {
        System.out.println("printInstanceVariables: " + a + " " + b);
    }

    public void printLocalVariables()
    {
        //int x;  //local variables needs to be initialized before using
        //char y;
        int x = 0;
        char y = 'a';
        System.out.println("printLocalVariables: " + x + " " + y);
    }
}
