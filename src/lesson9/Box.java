package lesson9;

import lesson6.Rectangle;

public class Box<T> {

    private T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setT("Generic string");
        System.out.println(stringBox.getT());

        Box<Integer> integerBox = new Box<>();
        integerBox.setT(123);

        System.out.println(integerBox.getT());

        Box<Rectangle> rectangleBox = new Box<>();
        Rectangle rectangle = new Rectangle();
        rectangleBox.setT(rectangle);
        System.out.println(rectangleBox.getT());

    }
}
