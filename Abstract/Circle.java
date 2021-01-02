package QuizPBO.Abstract;

public class Circle extends Shape {

    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }


    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }

}
