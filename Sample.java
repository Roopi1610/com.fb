public class Sample
{

    public void add()
    {

       int a=5, b=10;
       System.out.println(a+a);
    } 

    public void sub()
    {
        
        int a=5, b=10;
        System.out.println(b-a);
    }

    public void mul()
    {
        int a=5, b=10;
        System.out.println(a*a);
    }

    public void div()
    {
        int a=5, b=10;
        System.out.println(b/a);
    }

public static void main(String[] args)
{
    Sample s = new Sample();
    s.add();
    s.sub();
    s.mul();
    s.div();
    System.out.println("Program end");
}
}
