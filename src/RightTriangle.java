public class RightTriangle {
    private int a;
    private int b;
    private int c;

    public RightTriangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public RightTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public RightTriangle(RightTriangle triangle) {
        this.a = triangle.getA();
        this.b = triangle.getB();
        this.c = triangle.getC();
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
