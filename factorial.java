class factorial
{
     long sum(long  n)
    {
        if(n==0)
        return 1;
        else
        return n*sum(n-1);
    
    }
    public static void main(String args[])
    {
        factorial r=new factorial();
        long res=r.sum(47);
        System.out.println(res);
    }
}