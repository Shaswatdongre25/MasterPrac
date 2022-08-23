class A{
    void pro(int a, char b){
        System.out.println("This is  old method");
    }
}
class B extends A{
    static char e = 'f';
    void pro(int a, char b){
        System.out.println("This is new method in child class");
    }
    public static void main(String[] args) {
        B x =  new B();
        x.pro(2, e);
    }
}