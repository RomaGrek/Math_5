public class Function {

    static double function1XY(double x, double y) {
        return (-y + 7 * Math.exp(x));
    }

    static double function1X(double x) {
        return (1 + 7 * Math.exp(2 * x) / 2) * Math.exp(-x);
    }

    static double function2XY(double x, double y) {
        return (Math.pow(x, 2) + 2 * x + y);
    }

    static double function2X(double x) {
        return (Math.exp(x) - Math.pow(x, 2) - 4 * x - 4);
    }
}