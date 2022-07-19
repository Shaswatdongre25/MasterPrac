
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
}