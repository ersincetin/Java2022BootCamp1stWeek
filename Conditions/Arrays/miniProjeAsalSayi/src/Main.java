public class Main {
    public static void main(String[] args) {
        int sayi = 1, asalSayi;
        boolean mesaj = true;
        if (sayi == 1) {
            System.out.println("sayi asal değildir " + sayi);
            return;
        }
        if (sayi < 1) {
            System.out.println("geçersiz sayı girildi " + sayi);
        }

        if (sayi > 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    System.out.println("Bölen sayılar " + i);
                    mesaj = false;
                }
            }
            if (mesaj) {
                System.out.println("sayi asaldır. " + sayi);
            } else {
                System.out.println("sayi asal değildir. " + sayi);
            }

        }
    }
}