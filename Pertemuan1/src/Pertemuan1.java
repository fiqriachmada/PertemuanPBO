public class Pertemuan1 {
    static class BangunDatar {
        float panjang=3;
        float lebar=3;
        void luas(){
            float LUAS=panjang*lebar;
            System.out.println("Luas Persegi adalah "+LUAS);
        }
        void keliling() {
            float KELILING=panjang+lebar;
            System.out.println("Keliling Persegi adalah "+KELILING);
        }
        void luasSegitiga(){
            float LuasSegitiga=panjang*lebar/2;
            System.out.print("Luas Segitiga adalah "+LuasSegitiga);
        }
    }
    public static void main(String[] args){
        //Persegi
        BangunDatar persegi=new BangunDatar();
        persegi.luas();
        persegi.keliling();
        //Segitiga
        BangunDatar segitiga=new BangunDatar();
        segitiga.luasSegitiga();
    }
}
