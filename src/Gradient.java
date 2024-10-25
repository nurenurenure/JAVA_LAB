public class Gradient {
    private Pixel startColor;
    private Pixel endColor;

    public Gradient(Pixel start, Pixel end) {
        this.startColor = start;
        this.endColor = end;
    }

    public Image apply(Image image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                float ratio = (float) x / (image.getWidth() - 1);
                int r = (int) (startColor.getR() + ratio * (endColor.getR() - startColor.getR()));
                int g = (int) (startColor.getG() + ratio * (endColor.getG() - startColor.getG()));
                int b = (int) (startColor.getB() + ratio * (endColor.getB() - startColor.getB()));
                Pixel gradientPixel = new Pixel(r, g, b);
                image.setPixel(x, y, gradientPixel);
            }
        }
        return image;
    }
}
