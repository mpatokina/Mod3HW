package org.perscholas.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        maxOfTwo(5, 7);
        assignGrade(100);
        greeting(16, 20);
    }

    public static void maxOfTwo(int number1, int number2) {

        if (number1 > number2) {
            System.out.println(number1);
        } else if (number1 < number2) {
            System.out.println(number2);
        }
    }

    public static void assignGrade(int grade) {
        if (grade > 89) {
            System.out.println("A");
        } else if (grade > 79) {
            System.out.println("B");
        } else if (grade > 69) {
            System.out.println("C");
        } else if (grade > 54) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void greeting(int hour, int minutes) {
        if ((hour >= 5) && (hour < 12)) {
            System.out.println("Good Morning");
        } else if ((hour >= 12) && (hour < 16)) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Hey There");
        }
    }
}







        //buyKeychains();
        //buyKeychains(12);
        //buyKeychains("half a dozen");
        //hello();

       // ArrayList<String> food = new ArrayList< String >();
       // food.add("spaghetti");
       // food.add("Pizza");
       // System.out.println(food);
    //}
//}



        //int[] firstNumbers = new int[10];
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);
            //System.out.println(Arrays.toString(numbers));
        //}
    //}

    //}
    //public static void buyKeychains() {
    //    System.out.println("You bought a keychain");
    //}

    //public static void buyKeychains(int number) {
    //    System.out.println("You bought " + number + " keychains");
    //}

    //public static void buyKeychains(String phrase)  {
    //    System.out.println("You bought " + phrase + " keychains.");
    //}

    //public static void hello() {
    //    System.out.println("hello");
    //}
//}

