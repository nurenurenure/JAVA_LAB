public class BrightnessFilter extends Filter{
    private int brightness;

    public BrightnessFilter(int level) {
        this.brightness = level;
    }

    @Override
    public Image apply(Image image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Pixel pixel = image.getPixel(i, j);
                int r = Math.min(255, Math.max(0, pixel.getR() + brightness));
                int g = Math.min(255, Math.max(0, pixel.getG() + brightness));
                int b = Math.min(255, Math.max(0, pixel.getB() + brightness));
                Pixel brightPixel = new Pixel(r, g, b);
                image.setPixel(i, j, brightPixel);
            }
        }
        return image;
    }
}
