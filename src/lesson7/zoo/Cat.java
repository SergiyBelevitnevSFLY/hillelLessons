package lesson7.zoo;

public class Cat extends Animal {


    @Override
    public void makeSound(){
        System.out.println("MEOW!");
    }

    public void scratch(){
        System.out.println("I like scratch");
    }
}
