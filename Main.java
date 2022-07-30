import jdk.swing.interop.SwingInterOpUtils;

class Shweta

{
    String name,FRND1,FRND2,FRND3;
    int birthyear;

    Shweta(String n,String f1,String f2,String f3,int b)
    {
        name = n;
        FRND1 = f1;
        FRND2 = f2;
        FRND3 = f3;
        birthyear = b;
    }

    protected void display()
    {
        System.out.println("name: "+name+"\n"+"her friends : "+FRND1+" "+FRND2+" "+FRND3+"\n"+"Birth year : "+birthyear);
    }
}



class school extends Shweta
{
    String schoolname;
    school(String n,String f1,String f2,String f3,int b,String s)
    { super( n, f1, f2, f3,b);
        schoolname=s;
    }
    void method1()
    {
        super.display();
        System.out.println("school name : "+schoolname);
    }

}



class College extends Shweta
{
    String collegename;


    College (String n,String f1,String f2,String f3,int b,String c)
    { super( n, f1, f2, f3,b);
        collegename=c;
        System.out.println( "name : "+name+"\n"+"birth year :"+birthyear+"\n"+"collefge name : "+collegename);
    }


}

class Company extends Shweta
{ String compmayname ;
    Company(String n,String f1,String f2,String f3,int b,String cm)
    {
        super( n, f1, f2,f3, b);
        compmayname=cm;
    }

    void method3()
    {
        super.display();
        System.out.println("company name : "+compmayname);

    }

}







public class Main
{
    public static void main(String[] args)
    {
       school s1=new school("shweta patil","pushpa","radu","shiv",1999,"vikas") ;
       s1.method1();
        College c1 =new College("shweta patil","pushpa","radu","shiv",1999,"DNP") ;



        Company C1=new Company("shweta patil","pushpa","radu","shiv",1999,"TCS") ;
        C1.method3();




    }


}