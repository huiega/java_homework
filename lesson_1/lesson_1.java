
public class lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 45;
        int b = -65;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }else if (value>0) {
            System.out.println("Жёлтый");
        }else if (value<=100) {
            System.out.println("Жёлтый");
        }else if (value<100) {
            System.out.println("Зелёный");
        }

    }
    private static void compareNumbers() {
        int a = 3;
        int b = 2;
        if (a>=b) {
            System.out.println("a>=b");
        }else if (a<b){
            System.out.println("a<b");
        }
    }
}

