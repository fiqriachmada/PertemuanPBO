package pertemuan3kelasq1;

public class tabung extends bangun_ruang {
    double phi=3.14;
    int r;

    public tabung(int a, int height){
        this.r=a;
        super.tinggi=height;
        luasalas();
    }
    void luasalas (){
        double luas =phi*r*r;
        super.luasalas=luas;
    }
}
