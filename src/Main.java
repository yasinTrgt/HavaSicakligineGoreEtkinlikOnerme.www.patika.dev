import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;

        Scanner sc = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz :");
        sicaklik = sc.nextInt();

        if(sicaklik<5){
            System.out.print("Kayak yapmaya gidebilirsin.");
        }else if (sicaklik>5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsin.");
             if (sicaklik>10 && sicaklik<=25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        }else {
            System.out.print("Yüzmeye gidebilirsin.");

        }
    }
}
