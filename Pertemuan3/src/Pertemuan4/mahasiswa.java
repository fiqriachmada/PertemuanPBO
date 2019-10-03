package Pertemuan4;

public class mahasiswa
{
    String nama;
    int npm;
    int uts;
    int uas;
    int nas;
    //
    public mahasiswa(String nama, int npm,int uts, int uas)
    {
        this.nama=nama;
        this.npm=npm;
        this.uts=uts;
        this.uas=uas;
        this.nas=(uts+uas)/2;
    }
}