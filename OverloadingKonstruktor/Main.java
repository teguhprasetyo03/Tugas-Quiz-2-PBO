package QuizPBO.OverloadingKonstruktor;

public class Main  {
    public static void main(String[] args) {
        Teman baru = new Teman("Alfian Evan"); // constructor 1
        System.out.println("Ini Mengeksekusi constructor 1");
        baru.cetak();
        Teman lama = new Teman("Lutfia", 100); // constructor 1
        System.out.println("Ini Mengeksekusi constructor 2");
        lama.cetak();
        Teman cantik = new Teman("Jhon", 10, 200); // constructor 1
        System.out.println("Ini Mengeksekusi constructor 3");
        cantik.cetak();
    }
}

class Teman{

    public String nama;
    public int pacar = 0, mantan = 0;

    public Teman(String nama) { // constructor 1
        this.nama = nama;

    }
    public Teman(String nama, int pacar){ // constructor 2
        this.pacar = pacar;
        this.nama = nama;
    }

    public Teman(String nama, int pacar, int mantan){ // constructor 3
        this.mantan = mantan;
        this.nama = nama;
        this.pacar = pacar;
    }

    public void cetak(){
        System.out.println("Nama = "+ nama);
        System.out.println("Pacar = "+ pacar);
        System.out.println("Mantan = " +mantan);
    }
}