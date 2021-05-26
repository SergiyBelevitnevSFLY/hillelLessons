package lesson9.collections;

import lesson6.Rectangle;
import lesson6.RectangleConstructor;
import lesson8.product.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExample {

    public static void main(String[] args) {


        ArrayList<RectangleConstructor> rectangleConstructors = new ArrayList();
        rectangleConstructors.add(new RectangleConstructor(5,6));
        rectangleConstructors.add(new RectangleConstructor(4,8));
        rectangleConstructors.add(new RectangleConstructor(6,9));

        rectangleConstructors.add(0, new RectangleConstructor(2,3));

//        listOfNames.

        System.out.println("");


        ArrayList<String> listOfGirls = new ArrayList();
        listOfGirls.add("Karina");
        listOfGirls.add("Alyona");
        listOfGirls.add("Natalya");
        listOfGirls.add("Anna");
        listOfGirls.add("Yaroslava");
        listOfGirls.add("Oksana");

        ArrayList<String> listOfBoys = new ArrayList<>();
        listOfBoys.add("Sasha");
        listOfBoys.add("Kirill");
        listOfBoys.add("Ruslan");
        listOfBoys.add("Kolya");
        listOfBoys.add("Dyadya");

        ArrayList<String> allGroup = new ArrayList<>();
        allGroup.addAll(listOfBoys);
        allGroup.addAll(listOfGirls);
        allGroup.remove("Dyadya");
        System.out.println("");

        TreeSet<String> sorted = new TreeSet<>();
        sorted.addAll(allGroup);
        System.out.println("");
        boolean isOksanaPresent = allGroup.contains("Oksana");
        System.out.println("Oksana will be present " + isOksanaPresent);

        int howMuchPeople = allGroup.size();
        System.out.println("We have " + howMuchPeople);

        allGroup.add("Sergey");
        allGroup.add("Sergey");

        Iterator iterator = allGroup.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String person: allGroup){
            System.out.println(person);
        }

        for (int i = 0; i < allGroup.size(); i++){
            System.out.println(allGroup.get(i));
        }

        allGroup.forEach(name -> System.out.println(name));

        TreeSet<String> stringSet = new TreeSet();
        stringSet.addAll(allGroup);
        boolean isSashaWasPresent = !stringSet.add("Bill");

        System.out.println("Bill was present " + isSashaWasPresent);

        stringSet.forEach(System.out::println);


    }
}
