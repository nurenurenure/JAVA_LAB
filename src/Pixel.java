public class Pixel {
    private int R;
    private int G;
    private int B;

    public Pixel(int r, int g, int b) {
        this.R = r;
        this.G = g;
        this.B = b;
    }

    public Pixel() {
        this(0, 0, 0);
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        this.R = r;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        this.G = g;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        this.B = b;
    }

    public int getGray() {
        return (R + G + B) / 3;
    }

}
