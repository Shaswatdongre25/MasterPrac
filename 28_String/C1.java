class A{
    public static void main(String[] args) {
       /*  String name1= "umesh";
        String name2= "umesh"; */

        String name1= new String("umesh");
        String name2= name1;

        System.out.println(name1==name2);
    }
}