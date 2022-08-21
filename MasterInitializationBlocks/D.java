class D{
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("A");
        D x = new D();
        D y = new D();
        D z = new D();

        System.out.println("B");
    }
}