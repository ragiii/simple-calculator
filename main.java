import  java.util.Scanner;

public class main {
    public static void main(String[] args){
        int n1,n2;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz :");
        n1=input.nextInt();
        System.out.print("ikinci sayiyi giriniz :");
        n2=input.nextInt();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Hangi islemi yapacaksiniz? :");
        int select=input.nextInt();
        
        switch (select){
            case 1:
                System.out.print("Toplama :"+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma :"+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma :"+(n1*n2));
                break;
            case 4:
                if(n2!=0)
                    System.out.print("Bölme :"+(n1/n2));
                else
                    System.out.print("Bölme işlemi Hatali! , Bir sayı sıfıra bolunemez!");
                break;
            default:
                System.out.print("Yanlış Seçim Yaptınız. Tekrar Deneyiniz! ");

        }

    }
}
