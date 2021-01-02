package QuizPBO.Overloading;

public class Main {
    public static void main(String[] args) {

        Overloading overloading = new Overloading();
        overloading.hitung(40, 30);
        overloading.hitung(200, 30, 55);
        overloading.hitung(72.5, 20);
        overloading.kurang(100, 37.7, 40.2);

    }
}

class Overloading{
    public void hitung(int a,int b){
        System.out.println("Pengurangan A dan B = "+ (a-b));
    }

    public void hitung(int a,int b, int c){
        System.out.println("Pengurangan Dari A,B dan C = "+(a-b-c));
    }

    public void hitung(double angka1, int angka2){
        System.out.println("Pengurangan angka1 dan angka2 =  " +(angka1-angka2));
    }

    public void kurang(int nilai1, double nilai2, double nilai3){
        System.out.println("Pengurangan dari nilai 1,2 dan 3 = "+ (nilai1-nilai2-nilai3));
    }
}
