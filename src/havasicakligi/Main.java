package havasicakligi;

import java.util.Scanner;

/*
Hava Sıcaklığına Göre Etkinlik Önerme
Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.

Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the temprature: ");
        int temprature = scanner.nextInt();

        String result = temprature<5 ? "Ski" :
                ((temprature>= 5 && temprature<= 15) ? "Cinema" :
                        ((temprature >= 10 && temprature <= 25) ? "Picnic" :
                                ((temprature > 25) ? "Swimming" : "Be safe")));
        System.out.println(result);
    }
}
