package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static int num;
    static int[] nums;
    static String line;

    public static void main(String[] args) {
	// write your code here
        try {
            num = 2/0;
            nums = new int[-1];
            nums[0] = 2;
            line = null;

        } catch (NegativeArraySizeException illegalArgumentException) {
            System.out.println("Ну такого не бывает");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Нельзя делить целые числа в Java на ноль, забыл что-ли?");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Знай свои границы!");
        } catch (NullPointerException nullPointerException) {
            System.out.println("На себя по указывай лучше");
        }

        finally {
            System.out.println("Уничтожаем рабочие данные!");
            num = 0;
            line = "";
            nums = new int[0];
        }

        Student student = new Student();
        someFunction(student);
    }

    public static void someFunction(Student student) {
        try {
            try {
                student.deseriliaze(student.getName());
            } catch (MyDomainException e) {
                System.out.println(e.getMessage() + "\n" +
                        e.getLocalizedMessage());
                if (e.getCause() instanceof Exception) {
                    for (StackTraceElement element : e.getStackTrace()) {
                        System.out.println(element);
                    }
                    e.printStackTrace();
                    throw e;
                }
            }
        } catch (Exception ioException) {
            System.out.println();
            System.out.println(ioException.getMessage());
            for (StackTraceElement element : ioException.getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
