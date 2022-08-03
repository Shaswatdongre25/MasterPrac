class Animals {
    void sound(){
        System.out.println("animal sound");
    }

}

class Cat extends Animals {
    void sound(){
        System.out.println("cat sound");
    }

}

class Dog extends Cat {
    void sound(){
        System.out.println("dog sound");
    }



static class B{
    public static void main(String[] args) {
        Animals X = new Dog();
        X.sound();

    }
}


}