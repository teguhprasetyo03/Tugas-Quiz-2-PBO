package QuizPBO.No3;

public class Lingkaran extends BangunDatar {
    double r;

    double luas(){
        double luas = Math.PI*r*r;
        System.out.println("Luas Lingkaran adalah  = "+ luas);
        return luas;
    }

    double keliling(){
        double keliling = 2 * Math.PI * r;
        System.out.println("Luas Lingkaran adalah  = "+ keliling);
            return keliling;
    }

}
