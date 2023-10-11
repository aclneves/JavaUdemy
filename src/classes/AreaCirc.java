package classes;

public class AreaCirc {

    double raio;
    final static double PI = 3.14;

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
