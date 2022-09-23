public class Main {
    public static void main(String[] args) {
        char value = 'M';

        switch (value) {
            case 'a':
            case 'e':
            case 'ı':
            case 'i':
                System.out.println("karakter ince seslidir: " + value);
                break;
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                System.out.println("karakter kalın seslidir: " + value);
                break;
            default:
                System.out.println("yanlış karakter girildi " + value);
        }
    }
}