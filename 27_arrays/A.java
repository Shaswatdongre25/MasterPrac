class A{
    public static void main(String[] args) {
        Student[] x = {new Student("om", 12)};+
        System.out.println(x[0]);
    
    }
}

class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}