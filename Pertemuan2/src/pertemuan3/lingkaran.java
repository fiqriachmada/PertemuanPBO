package pertemuan3;

public class lingkaran {
    double phi = 3.14;
    int r;

    public lingkaran(int a){
        this.r=a;
    }
    double keliling(){
        double kil=2*phi*r;
        return kil;
    }
    double luas(){
        double luas=phi*r*r;
        return luas;
    }
    double[] proses(){
        double kil=2*phi*r;
        double luas=phi*r*r;
        double [] hasil=new double[2];
        hasil[0]=kil;
        hasil[1]=luas;
        return hasil;
    }
}
