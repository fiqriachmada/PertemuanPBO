package pertemuan3kelasq1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

        tabung TABUNG=new tabung(3,4);
        System.out.println("Volume Tabung = "+TABUNG.volume());
        balok BALOK=new balok(3,4,5);
        System.out.println("Volume Balok = "+BALOK.volume());
    }
}
