package burclar;

import java.util.Scanner;

/*Burç Bulan Program
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Aynı örneği switch-case kullanmadan yapınız. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isError = false;
        int month, day;
        String sign = "";

        System.out.print("Please enter month: ");
        month = scanner.nextInt();

        System.out.print("Please enter day: ");
        day = scanner.nextInt();

        if (month == 1) {
            if (day <= 21) {
                sign = "The Goat";
            } else if (day > 21 && day <= 31) {
                sign = "Aquarius";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day <= 19 && day > 0) {
                sign = "Aquarius";
            } else if (day > 19 && day <= 31) {
                sign = "Pisces";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day <= 20 && day > 0) {
                sign = "Pisces";
            } else if (day > 20 && day <= 31) {
                sign = "Ram";
            } else {
                isError = true;
            }
        }else if (month == 4) {
            if (day <= 20 && day > 0) {
                sign = "Ram";
            } else if (day > 20 && day <= 31) {
                sign = "Taurus";
            } else {
                isError = true;
            }
        }else if (month == 5) {
            if (day <= 21 && day > 0) {
                sign = "Taurus";
            } else if (day > 21 && day <= 31) {
                sign = "Gemini the Twins";
            } else {
                isError = true;
            }
        }else if (month == 6) {
            if (day <= 22 && day > 0) {
                sign = "Gemini the Twins";
            } else if (day > 22  && day <= 31) {
                sign = "Cancer";
            } else {
                isError = true;
            }
        }else if (month == 7) {
            if (day <= 22 && day > 0) {
                sign = "Cancer";
            } else if (day > 22 && day <= 31) {
                sign = "Leo";
            } else {
                isError = true;
            }
        }else if (month == 8) {
            if (day <= 22 && day > 0) {
                sign = "Leo";
            } else if (day > 22 && day <= 31) {
                sign = "Virgo";
            } else {
                isError = true;
            }
        }else if (month == 9) {
            if (day <= 22 && day > 0) {
                sign = "Virgo";
            } else if (day > 22 && day <= 31) {
                sign = "Libra";
            } else {
                isError = true;
            }
        }else if (month == 10) {
            if (day <= 22 && day > 0) {
                sign = "Libra";
            } else if (day > 22 && day <= 31) {
                sign = "Scorpio";
            } else {
                isError = true;
            }
        }else if (month == 11) {
            if (day <= 21 && day > 0) {
                sign = "Scorpio";
            } else if (day > 21 && day <= 31) {
                sign = "Archer";
            } else {
                isError = true;
            }
        }else if (month == 12) {
            if (day <= 22 && day > 0) {
                sign = "Archer";
            } else if (day > 22 && day <= 31) {
                sign = "The Goat";
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Please try again.");
        } else {
            System.out.println(sign);
        }
    }
}
