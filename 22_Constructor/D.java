class x
    {
        void pro(){}
        x(){
            System.out.println("constructor x ");
        }

    }

class y extends x{

    float z=8.2f;

    void info(){

    }

    y(){System.out.println( " Constructor in y");}
}

class A{
    public static void main(String[] args) {
        x a = new x();
    }
}