class A{
    int u = 6;
}
class B extends A{

    void pro(){

        System.out.println(u);

       
    }
    public static void main(String[] args) {
        B x = new B();
        x.pro();    
    }

}