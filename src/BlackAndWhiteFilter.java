public class BlackAndWhiteFilter extends Filter{
    public void apply(Image image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Pixel pixel = image.getPixel(i, j);
                int gray = pixel.getGray();
                Pixel grayPixel = new Pixel(gray, gray, gray);
                image.setPixel(i, j, grayPixel);
            }
        }
    }
}
