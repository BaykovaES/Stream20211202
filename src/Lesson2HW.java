public class Lesson2HW {
    public static void main(String[] agrs) {

        if (checkSum(2, 15)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println(checkNumber(-25));

        System.out.println(check(48));

        textLine("Hello", 3);

        if (whatYear(2021)){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }


    }

    public static boolean checkSum(int a, int b) {
        return ((a + b) > 10) && ((a + b) < 20);
    }

    public static String checkNumber(int a){
       if (a >= 0) {
           return "Positive number";
       }
       else {
           return "Negativ number";
       }
    }

    public static boolean check(int n) {
        if (n <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void textLine(String someTextLine, int quantity) {
        for (int i = 1; i <= quantity; i++) {
            System.out.println(someTextLine);
        }
    }
    public static boolean whatYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }





}

