//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Max(1, 3));
//        System.out.println(Delenie(5,0));
//        System.out.println(Convert("R"));
//        System.out.println(Age(5));
//        System.out.println(Sqrt(8, 3));
//        System.out.println(Factorial(4));
        int[] a = new int[] {1,2,3,4};
//        System.out.println(Proverka(a));
//        System.out.println(PoWW(5,2));
//        System.out.println(Obrezka("I am writting this text", 10));
//        System.out.println(Find(a, 4));
//        System.out.println(ConvertTo01(12));
//        System.out.println(PrDelnie(2,2));
//        System.out.println(IndexSpisok(a,1));
//        System.out.println(Password("12312311"));
//        System.out.println(Datea("12.12.2001"));
//        System.out.println(Obedinenie("AAA","BBBB"));
//        System.out.println(Temp(12));
//        System.out.println(StrokaPust("a"));
    }
//    ЗАДАЧА1
//    private static int Max(int a, int b){
//        if (a>b) return  a;
//        else if (b>a) return b;
//        else throw new IllegalArgumentException("a == b");
//    }
//    Задача 2
//    private static int Delenie(int a, int b){
//        if (b!=0)return a/b;
//        else throw new ArithmeticException("Нельзя делить на 0");
//    }
//    Задача 3
//    private static int Convert(String a){
//        try {
//            return Integer.parseInt(a);
//        }catch (NumberFormatException e){
//            throw new NumberFormatException("Нельзя конвертировать");
//        }
//
//    }
//    Задача 4
//    private static int Age(int a){
//        if (a>150 | a<0) throw new IllegalArgumentException("Этого не может быть");
//        else return a;
//    }
//    Задача 5
//    private static double Sqrt(double a, double b){
//        if (a>=0 & b>0) return Math.pow(a,1/b);
//        else throw new IllegalArgumentException("Из отрицательного числа можно найти корень, но будет трудно для нашей программы xd");
//    }
//    Задача 6
//    private static int Factorial(int a){
//        int sum=1;
//        if (a<0) throw new IllegalArgumentException("Отрицательный факториал");
//        else {
//            for (int i = 1; i <= a; i++) {
//                sum *=i;
//            }
//            return sum;
//        }
//    }
//    Задача 7
//    private static Boolean Proverka(int[] a){
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]==0) throw  new IllegalArgumentException("В массиве есть 0");
//
//        }
//        return true;
//    }
//    Задача 8
//    private static double PoWW (double a, double b){
//        if (b<0) throw new IllegalArgumentException("Отрицательная степень");
//        else return Math.pow(a,b);
//    }
//    Задача 9
//    private static String Obrezka(String a, int b){
//        if (a.length()<b) throw new IllegalArgumentException("Число символов больше длины строки");
//        else return a.substring(0,b);
//    }
//    Задача 10
//    private static int Find(int[]a, int b){
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]==b) return i;
//        }
//        throw new IllegalArgumentException("Не найден");
//    }
//    Задача 11
//    private static String ConvertTo01(int a){
//        if (a<0) throw new IllegalArgumentException("Отрицательное число");
//        String b = "";
//        while (a>0){
//            b = a%2+b;
//            a /=2;
//        }
//        return b;
//    }
//    Задача 12
//    private static Boolean PrDelnie(int a, int b){
//        if (b==0) throw new ArithmeticException.("Деление на 0");
//        if (a%b==0) return true;
//        else return false;
//    }
//    Задача 13
//    private static int IndexSpisok(int[] a,int b){
//        if (a.length-1<b) throw new IndexOutOfBoundsException.("За пределом");
//        else return a[b];
//    }
//    Задача 14
//    private static Boolean Password(String a){
//        if (a.length()<8) throw new WeakPasswordException.("Ненадежный пароль");
//        else return true;
//    }
//    class WeakPasswordException extends Exception {
//    public WeakPasswordException(String message) {
//        super(message);
//    }
//    Задача 15
//    private static boolean Datea(String a) {
//        if (!a.matches("([0-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.[0-9]{4}")) throw new DateTimeParseException("Некорректная дата", a, 0);
//        return true;
//    }
//    Задача 16
//    private static String Obedinenie(String a, String b){
//        if (a== null | b== null) throw new NullPointerException("Пустая строка");
//        else return a+b;
//    }
//    Задача 17
//    private static int Dellll(int a, int b){
//        if (b ==0) throw new ArithmeticException("Нельзя делить на 0");
//        else return a%b;
//    }
//    Задача 18
//    private static double Sqrt2(double a){
//        if (a<0) throw new IllegalArgumentException("Отрицательный корень");
//        else return Math.sqrt(a);
//    }
//    Задача 19
//    private static double Temp(double a){
//        if(a<-273.15) throw new IllegalArgumentException("Меньше абсолютного нуля");
//        else return a*9/5+32;
//    }
////    Задача 20
//    private static Boolean StrokaPust(String a){
//        if (a =="" | a==null) throw new IllegalArgumentException("Пустая строка");
//        else return true;
//    }
}