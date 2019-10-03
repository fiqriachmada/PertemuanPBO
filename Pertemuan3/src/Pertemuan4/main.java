package Pertemuan4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String nama;
        int npm;
        int uts;
        int uas;
        mahasiswa[] mhs=new mahasiswa[3];
        Scanner inputan= new Scanner(System.in);
        System.out.print("Masukkan banyak data : ");
        int data=inputan.nextInt();

        //
        for (int i=0;i<data;i++){
            System.out.print("Nama Mahasiswa  : ");
            nama=inputan.next();
            System.out.print("NPM Mahasiswa   : ");
            npm=inputan.nextInt();
            System.out.print("UTS Mahasiswa   : ");
            uts=inputan.nextInt();
            System.out.print("UAS Mahasiswa   : ");
            uas=inputan.nextInt();
            mhs[i]=new mahasiswa(nama,npm,uts,uas);
            //
        }
        for (int i=0;i<data;i++){
            System.out.println("Nama Mahasiswa  : "+mhs[i].nama);
            System.out.println("NPM Mahasiswa   : "+mhs[i].npm);
            System.out.println("NAS Mahasiswa   : "+mhs[i].nas);
        }
    }
}

