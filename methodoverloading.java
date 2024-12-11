class methodoverloading
{
    
    static void met()
    {
        System.out.println("hello ");
    }
    static void met(int h)
    {
        System.out.println("hello "+h);
    }
    static void met(int h,int j)
    {
        System.out.println("hello "+h+" "+j);
    }
    static void met(int h,int j,String r)
    {
        System.out.println("hello "+h+" "+j+" "+r);
    }
    public static void main(String args[])
    {
        met();
        met(7);
        met(7,4);
        met(7,4,"rajubhai");
    }
}