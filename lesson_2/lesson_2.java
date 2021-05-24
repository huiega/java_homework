package lesson_2;

public class lesson_2 {
    public static void main(String[] args) {
        summ(2, 13);
        full(0);
        tres(4);
//        String senti="String";
        quatro(20);
    }
    public static void summ(int a, int b) {
        int summ = a+b;
        if (summ>10 ) {
            System.out.print(true);
        } else if (summ<20) {
            System.out.print(false);
        }
        System.out.println("\t");
    }
    public static void full(int c) {
        if (c >= 0) {
            System.out.print("Положительное");
        } else if (c < 0) {
            System.out.print("Отрицательное");
        }

        System.out.println("\t");
    }
    public static boolean tres(int d){
        if (d<0) {return false;}
        else   {return true;}
    }
    public static void quatro(int E) {
        for (int i = 0; i<E; i++) {
            System.out.println("Stringoo");
        }
    }
}


