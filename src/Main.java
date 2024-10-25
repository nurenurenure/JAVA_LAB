public class Main {
    public static void main(String[] args) {
        Image image = new Image(10, 10);

        PhotoEditor editor = new PhotoEditor(image);

        // Применение фильтра яркости
        BrightnessFilter brightnessFilter = new BrightnessFilter(50);
        editor.applyFilter(brightnessFilter);

        editor.showImageInfo();

        Image image2 = new Image(5, 5);

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                int r = (x * 50) % 256;
                int g = (y * 50) % 256;
                Pixel pixel = new Pixel(r, g, 0);
                image2.setPixel(x, y, pixel);
            }
        }

        System.out.println("Original Image Pixels:");
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                Pixel pixel = image.getPixel(x, y);
                System.out.print("[" + pixel.getR() + "," + pixel.getG() + "," + pixel.getB() + "] ");
            }
            System.out.println();
        }
    }
}