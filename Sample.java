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

    public void m1()
    {
        Sytem.out.println("Java");
    }

    public void m2()
    {
        System.out.println("Selenium");

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
    s.m1();
    s.m2();
    System.out.println("Program end");
}
}
