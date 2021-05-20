package lesson7.zoo;

public class Zoo {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//        dog.jump();

//        Cat cat = new Cat();
//        cat.makeSound();
//        cat.scratch();

        Animal animalDog = new Dog();
        animalDog.makeSound();
        ((Dog) animalDog).jump();

        Animal animalCat = new Cat();
        animalCat.makeSound();
        ((Cat) animalCat).scratch();

        feed(animalDog);

//        feed(animalCat);

    }

    public static void feed(Animal animal){
        if(animal instanceof Dog) {
            System.out.println("Please eat Chuppy");
        } else if (animal instanceof Cat) {
            System.out.println("Here your kitykat");
        }
    }
}
