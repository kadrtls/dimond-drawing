import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("çizdirilecek olan şeklin boyutu için bir sayı giriniz.");
        int size= scanner.nextInt();
        for (int i=0;i<=size;i++){
            for (int j=0;j<(size-i);j++){
                System.out.print(" ");
            }
            for (int a=1;a<=(2*i+1);a++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int n=size;
        for (int x=0;x<size;x++){
            for (int z=0;z<=x;z++){
                System.out.print(" ");
            }
            for (int y=(n*2)-1;y>0;y--){
                System.out.print("*");
            }
            System.out.println(" ");
            n--;
        }
    }
}