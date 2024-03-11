package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //1. Если 5 в 15 степени больше миллиарда
        double x = Math.pow(5, 15);
        long y = 1000000000;
        if (x > y) {
            System.out.println("Степень это мощь. Power is a power.");
        }
        //2. Задайте переменную. Если она больше 0, вывести «позитив», если меньше 0, вывести «отрицательно»
        int isPositive = 1;
        if (isPositive > 0) {
            System.out.println("Позитив");
        } else {
            System.out.println("Отрицательно");
        }
        //3. Если квадратный корень из 15 миллионов меньше 5 тысяч
        int fromCorNumber = 15000000;
        int number = 5000;
        double result0 = Math.sqrt(fromCorNumber);
        if (result0 < number) {
            System.out.println("два измерения лучше, чем одно");
        }
        //4 Если 2 в 10 степени меньше 512 вывести -«Pentium 2», иначе вывести -«ARM»
        double num1 = Math.pow(2, 10);
        int num2 = 512;
        if (num1 < num2) {
            System.out.println("Pentium2");
        } else {
            System.out.println("ARM");
        }
//5. Задать две дробных переменных. Вывести наибольшую из них
        double num3 = 1.4;
        double num4 = 1.6;
        double result1 = Math.max(num3, num4);
        System.out.println(result1);
//6. Задать две переменных -first и second. Вывести first в степени second, second в степени first
        int first = 4;
        int second = 7;
        double firstCor = Math.pow(first, second);
        double secondCor = Math.pow(second, first);
        System.out.println("first в степени second " + (int) firstCor);
        System.out.println("second в степени first " + (int) secondCor);
//7. Задать две переменных -икс и игрек. Вывести, что больше -икс в степени игрек, или наоборот
        int x1 = 7;
        int y1 = 5;
        double x1StepY1 = Math.pow(x1, y1);
        double y1StepX1 = Math.pow(y1, x1);
        if (x1StepY1 > y1StepX1) {
            System.out.println("x1: " + "Big " + x1StepY1);
        } else {
            System.out.println("y1: " + "Big " + y1StepX1);
        }
        //8 1 до 100
        int res = 0;
        while (res < 100) {
            res = res + 1;
            System.out.print(res + " ");

        }
        //9 50 до 100
        int res1 = 49;
        while (res1 < 100) {
            res1 = res1 + 1;
            System.out.print(res1 + " ");
        }
        System.out.println();
        //10 100 до 1
        int res2 = 101;
        while (res2 > 1) {
            res2 = res2 - 1;
            System.out.print(res2 + " ");
            //11 0 до -100
            while (res2 > -100) {
                res2 = res2 - 1;
                System.out.print(res2 + " ");
            }
            //11 0 до -100
//        int res3 = 1;
//        while (res3 > -100) {
//            res3 = res3 - 1;
//            System.out.print(res3 + " ");
//        }
        }
        System.out.println();
        //12
        String str = "Оксана отмахнулась от осы";
        String ss = str.replaceAll("о", "обро");
        System.out.println(ss);
        //13
        System.out.println(str.toUpperCase());
        //14
        System.out.println(str.replaceAll("а", "@").replaceAll("о", "0"));
        //15
        String str1 = "Привет";
        String str2 = "Пока";
        int a = str1.length();
        int b = str2.length();
        if (a > b) {
            System.out.println("a:" + "Big");
        } else if (a < b) {
            System.out.println("b:" + "Big");
        } else {
            System.out.println("a == b:" + "Big");
        }
        //16. Задать три переменных, найти наибольшую из них
        int v = 3;
        int n = 4;
        int z = 5;
        int res4 = Math.max(v,Math.max(n,z));
        System.out.println(res4);


    }
}
