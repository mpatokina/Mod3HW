package org.perscholas.example;

public class Main {
    public static void main(String[] args) {
        String myString = "perscholas";
        String random = new StringBuilder(myString).reverse().toString();
        System.out.println(random);

        System.out.println(reverseWord("maria"));
        primeNum();
        getUp(true, 5);

    }

        static String reverseWord(String word) {
            int i, length = word.length();
            StringBuilder newWord = new StringBuilder(length);

            for (i = (length - 1); i >= 0; i--){
                newWord.append(word.charAt(i));
            }
            return newWord.toString();
        }
        
            static void primeNum(){
                int primeCheckNumber;
                int n = 1;
                int divisibleCount;

                while(n <= 20) {
                    divisibleCount = 0;
                    primeCheckNumber = 2;
                    while (primeCheckNumber <= n / 2) {
                        if (n % primeCheckNumber == 0) {
                            divisibleCount++;
                            break;
                        }
                        primeCheckNumber++;
                    }
                    if (divisibleCount == 0 && n !=1) {
                        System.out.println(n + " ");
                    }
                    n++;
                }
            }

    static void getUp (boolean squawking, int currentHour){
            if ( currentHour < 6 || currentHour > 22 ){
                squawking = true;
                System.out.println("true - get up");
            } else {
                System.out.println("false - keep sleeping");
            }
    }


}

