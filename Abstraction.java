abstract class Abstraction {
    abstract void sound();
    
}
class Dog extends animal{

    void sound(){
        System.out.println("Dog barks"));
    }
    class main{
        public static void  main(String[] args){
            Dog d= new Dog();
            d.sound();
        }
    }
}
