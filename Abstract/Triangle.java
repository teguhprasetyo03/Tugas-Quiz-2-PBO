package QuizPBO.Abstract;

public class Triangle extends Shape {

    private final float base;
    private final float height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    @Override
    float getArea() {
        return 0.5f * base * height;
    }

}