import java.util.*;
class a
{
    int c;
    String b;
    a()
    {
        this.c=74;
        this.b="hello amarnath";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class constructor
{
    public static void main(String args[])
    {
        a s=new a();
        s.display();
    }
}