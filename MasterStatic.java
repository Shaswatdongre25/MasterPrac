import javax.naming.directory.SchemaViolationException;

/* class Student{
    String name;
    int age;
    int maxAge = 20;

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "shashwat";
        s1.age = 25;
        s1.maxAge = 45;
        
        Student s2 = new Student();
        s2.name = "Sanskriti";
        s2.age = 22;
        s2.maxAge =50;

        System.out.println(s1.maxAge);
        System.out.println(s2.maxAge);
    }

}
 */


 /* //WAP marking component as static variable

 class Student{
    String name;
    int age;
    static int maxAge;

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "shashwat";
        s1.age = 26;
        s1.maxAge = 30;
        
        Student s2 = new Student();
        s2.name = "sANSRITI";
        s2.age = 23;
        s2.maxAge = 40;

        System.out.println(s1.maxAge);
        System.out.println(s2.maxAge);



    }
 } */


 /* class Circle{
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args){

        Circle c1 = new Circle();
        c1.radius = 10;
        
        
        Circle c2 = new Circle();
        c2.radius = 20;

        c1.calcArea();
    }
    void calcArea() {
        System.out.print(pi*radius*radius);
    }

}
 */



/*  class Circle{

    int radius;
    static float pie = 3.14f;

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 2;
        
        
        Circle c2 = new Circle();
        c2.radius = 3;

        c1.calcArea();
        System.out.println(getPie());

        System.out.println(c1.getPie());
        System.out.println(c2.getPie());


    }
        
        void calcArea(){
            System.out.println(radius * pie * radius);
        }

       static float getPie(){
        return pie;
       } 

 } */

/*  class Circle{

    int radius;
    static float pie = 3.14f;

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 2;
        
        
        Circle c2 = new Circle();
        c2.radius = 3;

        c1.calcArea();
        System.out.println(getPie());

        System.out.println(getPie());
        System.out.println(getPie());


    }
        
        void calcArea(){
            System.out.println(radius * pie * radius);
        }

       static float getPie(){
        return pie;
       } 

 } */


/*  class Employeedata{

    int age;
    String name;

    public static void main(String[] args){
        
        Employeedata E1 = new Employeedata();
        E1.age = 26;
        E1.name = "Shashwat";
        
        Employeedata E2 = new Employeedata();
        E2.age = 23;
        E2.name = "Sanskriti";

        E1.ShowInfo();


    }

    void ShowInfo(){

        System.out.println(name);
        System.out.println(age);

    }

 } */

