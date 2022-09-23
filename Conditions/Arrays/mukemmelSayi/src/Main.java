public class Main {
    public static void main(String[] args) {
        int perfect = 29;
        int sum = 0;
        if (perfect > 0) {
            for (int i = 1; i < perfect; i++) {
                if (perfect % i == 0) {
                    System.out.println("pozitif bölen sayılar: " + i);
                    sum = sum + i;
                }
            }

            if (sum == perfect) {
                System.out.println("sayi mükemmeldir " + perfect);
            } else {
                System.out.println("sayi mükemmel değildir " + perfect);
            }
        } else {
            System.out.println("alınan sayı negatif olamaz");
        }
    }
}