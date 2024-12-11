import java.util.*;
class constructor
{
    int c;
    String b;
    constructor(int c,String b)
    {
        this.c=c;
        this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class parameterconstructor
{
    public static void main(String args[])
    {
        constructor s=new constructor(74,"nanna");
        s.display();
    }
}