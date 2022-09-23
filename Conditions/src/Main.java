public class Main {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 20;

        if (number1 < number2) {
            System.out.println(number1 + "," + number2 + "den küçüktür");
        } else if (number1 == number2) {
            System.out.println("İki sayı birbirine eşittir.");
        } else {
            System.out.println(number1 + "," + number2 + "'den büyüktür.");
        }
    }
}