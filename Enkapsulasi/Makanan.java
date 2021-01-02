package QuizPBO.Enkapsulasi;

public class Makanan {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();

        restoran.setMenu("Nasi Padang Pake Rendang");
        restoran.setHarga(30000.0);
        restoran.setBanyak(3);
        restoran.setJumlah(90000.0);

        System.out.println("Menu Makanan : " +restoran.getMenu());
        System.out.println("Harga Makanan : " + restoran.getHarga());
        System.out.println("Banyaknya Pesanan : "+ restoran.getBanyak());
        System.out.println("Jumlah Harga : " + restoran.getJumlah());
    }
}
