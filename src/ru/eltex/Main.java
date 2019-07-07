package ru.eltex;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        Integer productPrice;
        

        TestClass someObject = new TestClass("naamee", 15);

        Class classObject = TestClass.class;
        System.out.println(classObject);

        //получение пакета класса
        Package package1 = classObject.getPackage();
        System.out.println(package1);

        //получение реализованных интерфейсов
        Class[] interface1 = classObject.getInterfaces();
        for (Class i : interface1) {
            System.out.println(i);
        }

        //Просмотр приватного поля у объекта класса TestClass
        try {
            Field field = someObject.getClass().getDeclaredField("productPrice");
            field.setAccessible(true);
            productPrice = (Integer) field.get(someObject);
            System.out.println(productPrice);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
