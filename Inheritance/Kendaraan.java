package QuizPBO.Inheritance;

public class Kendaraan {
    String merk;
    int kecepatan;
    String jenis;

    void setAtribut(String merk, String jenis){
        this.merk = merk;
        this.jenis = jenis;
    }

    void Melaju (int kecepatan){
        this.kecepatan = kecepatan;
        System.out.println("======MELAJU======");
        System.out.println("Kecepatan " + kecepatan +" km/jam") ;
    }
    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

}

class Motor extends Kendaraan{
    public static void main(String[] args) {

    Motor motor = new Motor();

    motor.setAtribut("HONDA", "CBR 150R");

    // Menampilkan output
     System.out.println("Jenis Kendaraan : " +motor.getJenis());
     System.out.println("Merk Kendaraan : "+motor.getMerk());
    motor.Melaju(280);
    }
}

