class A{

    public static void main(String[] args) {
        int[] x = new int[5];
        
        System.out.println("Length of array:"+ x.length);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        x[0] = 0;
        x[1] = 1;
        x[2] = 2;
        x[3] = 3;
        x[4] = 4;

        System.out.println("Assigned value of array:" + x.length);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);


    }
}