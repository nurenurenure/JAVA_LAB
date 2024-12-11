import static java.lang.Math.max;
import static java.lang.Math.min;

public class Pixel {
    private int R;
    private int G;
    private int B;
    // Статическое поле для подсчета объектов Pixel
    private static int pixelCount = 0;

    public Pixel(int r, int g, int b) {
        this.R = r;
        this.G = g;
        this.B = b;
        pixelCount++;
    }

    public Pixel() {
        this(0, 0, 0);
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        if (r < 0 || r > 255) {
            throw new IllegalArgumentException("Red value must be between 0 and 255.");
        }
        this.R = r;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        if (g < 0 || g > 255) {
            throw new IllegalArgumentException("Red value must be between 0 and 255.");
        }
        this.G = g;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        if (b < 0 || b > 255) {
            throw new IllegalArgumentException("Red value must be between 0 and 255.");
        }
        this.B = b;
    }

    public int getGray() {
        try {
            int gray = (this.R + this.G + this.B) / 3;
            return gray;
        } catch (ArithmeticException e) {
            System.err.println("Error while calculating gray value: " + e.getMessage());
            return -1; // Возвращаем значение по умолчанию в случае ошибки
        }
    }
    // Статический метод для получения количества объектов Pixel
    public static int getPixelCount() {
        return pixelCount;
    }
    static int clamp(int value) {
        return max(0, min(255, value));
    }

}
