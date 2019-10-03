package pertemuan3kelasq1;

public class balok extends bangun_ruang {
    int panjang;
    int lebar;

    public  balok(int panjang, int lebar, int height){
        this.panjang=panjang;
        this.lebar=lebar;
        super.tinggi=height;
        luasalas();
    }
    void luasalas(){
        int luas=panjang*lebar;
        super.luasalas=luas;
    }
}
