class this2
{
    String name;
    this2(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
        this2 obj=new this2("gangadhar");
        obj.agt();
    }
}
class teacher{
    public void teach(this2 s)
    {
        s.display();
    }
}

    

    
    
    
