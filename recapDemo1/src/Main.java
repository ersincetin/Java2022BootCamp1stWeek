public class Main {
    public static void main(String[] args) {
        int sayi1 = 10021 , sayi2 = 2000022 , sayi3 = 300111;
        int buyukSayi;
        if (sayi1>sayi2){
            buyukSayi=sayi1;
            if (buyukSayi>sayi3){
                buyukSayi=sayi1;
                System.out.println(" büyük sayı :" +buyukSayi + " " +"sayi1'dir");
            }else {
                buyukSayi=sayi3;
                System.out.println(" büyük sayı :" +buyukSayi +" " + "sayi3'tür ");
            }
        } else if(sayi2>sayi3){
            buyukSayi=sayi2;
            System.out.println(" büyük sayı :" +buyukSayi + " " +"sayi2'dir ");
        } else {
            buyukSayi=sayi3;
            System.out.println(" büyük sayı :" +buyukSayi +" " + "sayi3'dür ");
        }
    }
}