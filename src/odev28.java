import java.util.Scanner;

public class odev28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a,i,top=0,bol=1;

        System.out.print("Lutfen Sayinizi Giriniz : ");
        a = input.nextLong();

        for (i=1; i<a;i++){
            if (a%i==0){
                bol = i;
                top += bol ;
            }
        }
        if (top==a){
            System.out.println(a+" mukemmel sayi");
        }else {
            System.out.println(a+" mukemel sayi degildir.");
        }
    }
}
