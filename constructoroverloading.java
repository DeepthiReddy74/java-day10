import java.util.*;
class constructoroverloading
{
    String name;
    constructoroverloading()
    {
        name="jagan";
    }
    constructoroverloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);

    }
    public static void main(String args[])
    {
        constructoroverloading obj=new constructoroverloading();
        obj.display();
        constructoroverloading obj1=new constructoroverloading();
        obj1.display();
    }
}