class A{
    void iCanWalk(){
        System.out.println("Can walk");
    }
}

class B extends A{
    void iCanRun(){
        System.out.println("Can Run");
    }
}

class C extends B{
    void iCanLaugh(){
        System.out.println("Can laugh");
    }
}

class X{
    
    public static void main(String[] args) {
      /*  C X = new C();
       
       X.iCanLaugh();
       X.iCanRun();
       X.iCanWalk();
       System.out.println(X.toString()); */

       B Y = new C();
       //Y.iCanLaugh();
       Y.iCanRun();
       Y.iCanWalk();
       System.out.println(Y.toString());

    
    }
}