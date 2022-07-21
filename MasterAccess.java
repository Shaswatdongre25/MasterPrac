/* 
//1: WAP to Access through instantiation
class A{
    
    public static void main(String[] args){

        B x = new B();
        x.pro();
        System.out.println(x.y);


    }
    

}

class B{

    int y=20;

    void pro(){
        System.out.println("hello");
    }
} */

//================================================================



//2:WAP to access through inheritance

/* class A extends B{
    public static void main(String[] args){

        A x = new A();
        x.pro();
        System.out.println(x.y);
    }
}

class B{
    int y = 20;

    void pro(){
        System.out.println("This is inside B")
    }
} */


//=============================================================================




/* //3: WAP to demonstrate HAS-A relationship

class Student
{
    public static void main(String[] args)
    {
        pen x = new pen();
        x.write();
    }
}

class pen
{
    void write()
    {
        System.out.println("This is write method");
    }
} */






/* //4:WAP to demonstrate IS-A relationship

class Student extends pen
{
    public static void main(String[] args)
    {
        Student x = new Student();
        x.write();
    }
}

class pen
{
    void write()
    {
        System.out.println("This is inside write method");
    }
} */


