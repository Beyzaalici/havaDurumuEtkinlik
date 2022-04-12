import java.util.Scanner;

public class Main {
    /**
     * Hava Sıcaklığına Göre Etkinlik Önerme
     * Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.
     *
     * Koşullar :
     *
     * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
     * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
     * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
     * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        int sicaklik;
        String kayak, sinema, piknik, yuzme;
        Scanner input = new Scanner(System.in);
        System.out.println("Bugun hava kac derece ? ");
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.println("Bugun hava 'KAYAK' yapmak icin cok uygun !");
        }else if(sicaklik<5 && sicaklik>15){
            System.out.println("Bugun hava 'SINEMA' icin cok uygun !");
        }else if(sicaklik<15 && sicaklik>25){
            System.out.println("Bugun hava 'PIKNIK' icin cok uygun !");
        }else{
            System.out.println("Bugun hava 'YUZME' icin cok uygun !");
        }




    }
}
