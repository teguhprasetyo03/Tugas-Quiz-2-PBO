package QuizPBO.No4;


public class Main {
    public static void main(String[] args) {

        Manajer manajer = new Manajer();
        Kabag kabag = new Kabag();
        Staff staff = new Staff();

        // tampil gaji Manajer
        manajer.tampilGaji();
        manajer.Gaji(200000,1500000,2000000);

        // Tampil Gaji Kabag
        kabag.tampilGaji();
        kabag.Gaji(150000,1000000,1000000);

        // Tampil Gaji Kabag
        staff.tampilGaji();
        staff.Gaji(100000,500000,0);
    }
}


class Karyawan {
        double tj_jbt;
        double tj_golongan;
        double tj_kehadiran;
        double gaji;

        public void Gaji(double tj_kehadiran, double tj_golongan, double tj_jbt){
          this.tj_golongan = tj_golongan;
          this.tj_jbt = tj_jbt;
          this.tj_kehadiran = tj_kehadiran;
          gaji = tj_golongan + tj_jbt + tj_kehadiran;
          System.out.println("Gaji Yang Di Dapat Adalah = Rp. "+gaji);
        }
}

class Manajer extends Karyawan{

    public void tampilGaji(){
        System.out.println("====Menghitung Gaji Manajer====");
        System.out.println("Tunjangan Jabatan Manajer = Rp.2.000.000");
        System.out.println("Tunjangan Golongan C = Rp. 1.500.000");
        System.out.println("Tunjangan Kehadiran = Rp. 200.000");
    }
}

class Kabag extends Karyawan{

    public void tampilGaji(){
        System.out.println("\n====Menghitung Gaji Kabag====");
        System.out.println("Tunjangan Jabatan Kabag = Rp.1.000.000");
        System.out.println("Tunjangan Golongan B = Rp. 1.000.000");
        System.out.println("Tunjangan Kehadiran = Rp. 150.000");
    }
}

class Staff extends Karyawan{
    public void tampilGaji(){
        System.out.println("\n====Menghitung Gaji Staff====");
        System.out.println("Tunjangan Jabatan Staff = Rp. 0");
        System.out.println("Tunjangan Golongan A = Rp. 500.000");
        System.out.println("Tunjangan Kehadiran = Rp. 100.000");
    }
}
