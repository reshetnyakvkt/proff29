package quizful.testInterface.circle;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.testInterface.circle
 */
class Circle implements Square, Perimeter{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double perimeter() {
        return 2*Math.PI*r;
    }

    public double square() {
        return Math.PI*r*r;
    }

}