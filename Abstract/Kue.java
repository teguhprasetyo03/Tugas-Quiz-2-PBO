package QuizPBO.Abstract;

public class Kue extends Komponen {
    public static void main(String[] args) {
        Kue kue = new Kue();
        kue.bahan_bahan();
        kue.proses_pembuatan();
        kue.pelatan();
    }

    @Override
    void bahan_bahan() {
        String[] bahan = {"", "Tepung Terigu", "Gula", "Oven",
                "Telur", "Mentega" };

        System.out.println("====BAHAN-BAHAN====");

        for (int i = 1; i < bahan.length; i++) {
            System.out.println(i + ". " + bahan[i] + " \t " );
        }
    }

    @Override
    void pelatan() {
        String[] alat = {"","Mixer", "Loyang", "Oven",
                        "Spatula", "Kertas Roti" };

        System.out.println("====ALAT-ALAT====");

        for (int i = 1; i < alat.length; i++) {
            System.out.println(i + ". " + alat[i] + " \t " );
        }
    }


    @Override
    void proses_pembuatan() {
        String[] proses = {"",
                "Tuangkan Bahan-Bahan Ke Dalam Mixer",
                "Masukkan Ke Dalam Loyang",
                "Lalu Masukkan Ke Dalam Oven",
                "Oven Sampai Matang",
                "Selesai" };

        System.out.println("====PROSES PEMBUATAN====");

        for (int i = 1; i < proses.length; i++) {
            System.out.println(i + ". " + proses[i] + " \t " );
        }
    }
}
