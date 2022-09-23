public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel    ";

        System.out.println(mesaj);

        System.out.println("Eleman sayısı :" + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));

        // concat birleştirmek demektir.
        System.out.println(mesaj.concat(" değil mi ?"));

        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));

        char[] karakterler = new char[5];
        //mesaj olarak tanımladığımız değişkendeki
        // belirlediğimiz karaktleri karaktarler arrayine ata
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        // belirtilen karakterin mesaj içinde kaçıncı eleman olduğunu bulmaya yarar.
        System.out.println(mesaj.indexOf('n'));

        //aramaya en sağdan başlar
        System.out.println(mesaj.lastIndexOf('n'));

        // ingilizce karakterlerin türkçeye çevrilmesi gibi durumlarda kullanılır.
        System.out.println(mesaj.replace(' ','-'));

        //mesajın 3.indexinden itibaren parçala diyoruz
        System.out.println(mesaj.substring(3));

        //3'ten başla 5'e kadar al
        System.out.println(mesaj.substring(3,5));

        //boşluğa göre mesaj'ı parçala ve array olarak ver.
        for(String kelimeler : mesaj.split(" ")){
            System.out.println(kelimeler);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj);
        // mesaj'ın başındaki ve sonundaki boşlukları atmamıza olanak sağlar
        System.out.println(mesaj.trim());
    }
}