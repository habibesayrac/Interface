package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tutatr giriniz:  ");
        double price = input.nextLine();

        System.out.println("Kart No giriniz:  ");
        String cardNumber = input.nextLine();

        System.out.println("Son kullanım Tarihi Giriniz:   ");
        String date = input.nextLine();

        System.out.println("Güvenlik Kodu giriniz:  ");
        String cvc = input.nextLine();

        System.out.println("1. A Bankası ");
        System.out.println("2. B Bankası ");
        System.out.println("3. C Bankası ");
        System.out.println("Banka Seçiniz:  ");

        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A Bankası" , "123456","98765");
                aPos.connect("127.0.0.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası", "34567", "123456");
                bPos.connect("127.0.0.1");
                bPos.payment(price,cardNumber,date,cvc);
                default:
                System.out.println("Geçerli Banka Giriniz ! ");


        }
    }
}
