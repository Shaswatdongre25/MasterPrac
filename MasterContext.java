/* class A{
    
    public static void main(String[] args){
        y();
    }

    static void y(){
        System.out.println(20);
    }

} */


/* class A{

    int y = 4;

    void pro(){
        System.out.println(y);
    }

    public static void main(String[] args){
    
        A a = new A();
        a.pro();
        
    }
} */



/* class A{

    static float y = 3.177f;

    public static void main(String[] args){
        System.out.println(A.y);

    }
} */


class A{
    static char w = 'E';

    void pro(){
        System.out.println(w);
    }
    public static void main(String[] args){
        A x = new A();
        x.pro();

    }
}