public class Main {
    public static void main(String[] args) {
        char grade = 'D';
        switch (grade) {

            case 'A':
                System.out.println("Mükemmel geçtiniz.");
                break;
            case 'B':
                System.out.println("İyi geçtiniz");
                break;
            case 'C':
                System.out.println("ortalama geçtiniz");
                break;
            case 'D':
                System.out.println("şartlı geçtiniz");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}