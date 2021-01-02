package QuizPBO.Interface;

public class Mobil implements Kendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.design();
        mobil.mesin();
    }

    @Override
    public void mesin() {
        System.out.println("Mobil Mempunyai Kecepatan "+ kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mobil Memiliki Model " + model);
    }
}
