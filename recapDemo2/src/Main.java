public class Main {
    public static void main(String[] args) {
        double[] myList = new double[4];
        double[] mylist2 = {13.9, 2.5, 24.3, 8.5};
        double sum = 0;
        double buyukSayi = mylist2[0];

        for (double number : mylist2) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("array içindeki sayıların toplamı : " + sum);
        for (double number : mylist2) {
            if (buyukSayi < number) {
                buyukSayi = number;
            }
        }
        System.out.println("dizedeki en büyük sayi = " + buyukSayi);
    }
}