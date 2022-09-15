/* class A {
    public static void main(String[] args) {
        String x = "omji";
        
        String a = "om";
        String b = "ji";

        // String c = a + b;   //false
        String c = a.concat(b); //false

        System.out.println(c == x);
    }
}


====================================================================== */



class A {
    public static void main(String[] args) {
        
        String a = "om";
        String b = "ji";
        String c = "maharaj";
        String d = "ji";
       
        String x = a.concat(b).concat(c).concat(d);
       // String x = a+b+c+d;

        System.out.println(x);
    }
}