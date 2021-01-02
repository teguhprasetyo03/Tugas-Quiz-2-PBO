package QuizPBO.Overriding;

public class Main {
    public static void main(String[] args) {

        Tumbuhan melati = new Tumbuhan();
        Mawar mawar = new Mawar();
        Tumbuhan miripmawar = new Mawar();

        melati.duri();
        mawar.duri();
        miripmawar.duri();
        miripmawar.makan();
    }
}

class Tumbuhan{
    void duri(){
        System.out.println("Tumbuhan tidak berduri");
    }
    void makan(){
        System.out.println("Tumbuhan berfotosintesis");
    }
}

class Mawar extends Tumbuhan{
    void duri(){
        System.out.println("Mawar Berduri");
        }
}