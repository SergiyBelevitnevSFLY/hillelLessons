package lesson10.innerClasses.secondExample;

public class TestAnimal {

    public static void main(String[] args) {
//        AwesomeAnimal awesomeAnimal = new AwesomeAnimal();
//        awesomeAnimal.eat();

//        Animal animal = new Animal(){
//            @Override
//            public void eat() {
//                System.out.println("Awesome animal eating");
//            }
//        };
//        animal.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Awesome animal eating (interface able to eat)" );
            }
        };
        ableToEat.eat();
    }
}
