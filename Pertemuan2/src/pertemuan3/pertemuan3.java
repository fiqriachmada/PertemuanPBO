package pertemuan3;

import java.util.Scanner;

public class pertemuan3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        int jari=input.nextInt();
        lingkaran ling=new lingkaran(jari);
        double keliling=ling.keliling();
        System.out.println("Keliling Lingkaran = "+ling.keliling());
        System.out.println("Luas Lingkaran = "+ling.luas());

        double[] hasil=new double[2];
        hasil=ling.proses();
        System.out.println("Keliling Lingkaran = "+hasil[0]);
        System.out.println("Luas Lingkaran = "+hasil[1]);
    }
}
