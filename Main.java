package HomeWork141;

import java.lang.reflect.Method;
/*
Создать класс с несколькими методами.
Вызвать метод по имени заданном как строка используя рефлексию
 */

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            testReflection(test, "test2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testReflection(Test test, String test2) throws Exception{
            Method  method = test.getClass().getMethod("test2");
            method.invoke(test);
    }
}
