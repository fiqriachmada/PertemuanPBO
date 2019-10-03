import java.util.Scanner;

public class TugasPertama {
    static class volume{
        float panjang;
        float lebar;
        float tinggi;

        public volume(){
            Scanner input=new Scanner(System.in);
            System.out.print("Masukkan nilai Panjang = ");
            float a=input.nextInt();
            System.out.print("Masukkan nilai Lebar = ");
            float b=input.nextInt();
            System.out.print("Masukkan nilai Tinggi = ");
            float c=input.nextFloat();
            this.panjang=a;
            this.lebar=b;
            this.tinggi=c;
        }
        //cetak
        void balok(){
            System.out.println("Volume Balok = "+panjang*lebar*tinggi);
        }
        void limasSegiempat(){
            System.out.println("Volume Limas Segiempat = "+panjang*lebar*tinggi*1/3);
        }
        void limasSegitiga(){
            System.out.println("Volume Limas Segitiga = "+panjang*lebar*1/2*tinggi*1/3);
        }
    }
    public static void main(String[] args){
        System.out.println("Volume Balok");
        volume Balok=new volume();

        System.out.println("*========*");

        System.out.println("Volume Limas Segiempat");
        volume LimasSegiempat=new volume();

        System.out.println("*========*");

        System.out.println("Volume Limas Segitiga");
        volume LimasSegitiga=new volume();

        System.out.println("*========*");
        Balok.balok();
        LimasSegiempat.limasSegiempat();
        LimasSegitiga.limasSegitiga();
    }
}
