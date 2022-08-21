class A{

    int a = 11;
    void info(){
        System.out.println("This is info method inside class A");

    }
}
    
class B extends A { 

    int a = 22;
    void info(){
        System.out.println("This is info method inside class B");

    }
    void pro(){

        System.out.println(a);
        System.out.println(super.a);
        info();
        super.info();

    }
    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}
