package QuizPBO.Poli;

public class Main {
    public static void main(String[] args) {

        Kendaraan [] kendaraan = new Kendaraan[3];

        kendaraan[0] = new Motor();
        kendaraan[1] = new Mobil();

        for (int i = 0; i < kendaraan.length; i++ ){
            kendaraan[i].setLaju();
            kendaraan[i].setMerk();
            kendaraan[i].setNama();
            System.out.println();
        }
    }
}

class Kendaraan{
    // method default
    void setLaju(){
//        double laju = 0.0;
//        System.out.println("Laju Kendaraan : "+ laju +" km ");
    }
    void setNama(){
//        String nama = "Tidak Bernama";
//        System.out.println("Nama Kendaraan : " + nama);
    }
    void setMerk(){
//        String merk = "Tidak Bermerek";
//        System.out.println("Merk Kendaraan : " + merk);
    }
}
class Motor extends Kendaraan{
    void setLaju(){
        double laju = 70.55;
        System.out.println("Laju Kendaraan : "+ laju +" km ");
    }
    void setNama(){
        String nama = "CBR 150%";
        System.out.println("Nama Kendaraan : " + nama);
    }
    void setMerk(){
        String merk = "Honda";
        System.out.println("Merk Kendaraan : " + merk);
    }
}

class Mobil extends Kendaraan{
    void setLaju(){
        double laju = 220.10;
        System.out.println("Laju Kendaraan : "+ laju +" km ");
    }
    void setNama(){
        String nama = "Avanza";
        System.out.println("Nama Kendaraan : " + nama);
    }
    void setMerk(){
        String merk = "Toyota";
        System.out.println("Merk Kendaraan : " + merk);
    }
}