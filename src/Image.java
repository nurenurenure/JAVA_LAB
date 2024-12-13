public class Image {
    private int width;
    private int height;
    private Pixel[][] pixels;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new Pixel[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[i][j] = new Pixel();
            }
        }
    }

    public int getWidth() {
        return width;
    }
    private int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }

    public int getHeight() {
        return height;
    }

    public Pixel getPixel(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return pixels[x][y];
        } else {
            throw new IndexOutOfBoundsException("Неверные координаты.");
        }
    }

    public void setPixel(int x, int y, Pixel pixel) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            pixels[x][y] = pixel;
        } else {
            throw new IndexOutOfBoundsException("Неверные координаты.");
        }
    }

    public void resize(int newWidth, int newHeight) {
        Pixel[][] newPixels = new Pixel[newWidth][newHeight];
        for (int i = 0; i < Math.min(width, newWidth); i++) {
            for (int j = 0; j < Math.min(height, newHeight); j++) {
                newPixels[i][j] = pixels[i][j];
            }
        }
        pixels = newPixels;
        width = newWidth;
        height = newHeight;
    }
    protected Object clone() {
        try {
            // Вызов стандартного клонирования от Object
            Image cloned = (Image) super.clone();
            // Клонируем только массив ссылок на пиксели (поверхностно)
            cloned.pixels = this.pixels.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null; // В случае ошибки возвращаем null
        }
    }
    public Image deepClone() {
        // Создаем новое изображение с такими же размерами
        Image deepCloned = new Image(this.width, this.height);

        // Копируем каждый пиксель
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                Pixel originalPixel = this.pixels[i][j];
                deepCloned.setPixel(i, j, new Pixel(originalPixel.getR(), originalPixel.getG(), originalPixel.getB()));
            }
        }
        return deepCloned;
    }
    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[i][j].display();
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
