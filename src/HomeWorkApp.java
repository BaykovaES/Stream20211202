public class HomeWorkApp {

    public static void main(String[] agrs) {

        String fruitsTree = printThreeWords("Orange");
        System.out.println(fruitsTree);

        String fruitsTree2 = printThreeWords("Banana");
        System.out.println(fruitsTree2);

        String fruitsTree3 = printThreeWords("Apple");
        System.out.println(fruitsTree3);


        int value1 = 15;
        int value2 = 18;
        int result;

        result = checkSumSign(value1, value2);

        if (result >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The amount is negative");
        }

        int color = printColor(56);
        if (color <= 0) {
            System.out.println("Red");
        }
        else if (color > 0 && color <= 100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }

        String numbers = compareNumbers(8, 3);
            System.out.println(numbers);





    }

    public static String printThreeWords(String tree) {
        return tree;
    }

    public static int checkSumSign(int value1, int value2) {
        return value1 + value2;
    }

    public static int printColor(int value) {
        return value;
    }

    public static String compareNumbers(int a, int b) {
        if (a >= b){
            return ("a >= b");
        }
        else {
            return ("a < b");
        }


    }


}






//
//5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//и инициализируйте их любыми значениями, которыми захотите.
//Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
//6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.