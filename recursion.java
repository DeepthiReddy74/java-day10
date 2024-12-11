class recursion
{
    int sum(int n)
    {
        if(n==0)
        return 0;
        else
        return n+sum(n-1);
    
    }
    public static void main(String args[])
    {
        recursion r=new recursion();
        int res=r.sum(74);
        System.out.println(res);
    }
}