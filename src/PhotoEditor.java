public class PhotoEditor {
    private Image image;
    private Filter[] filters;
    private int filterCount;

    public PhotoEditor(Image image) {
        this.image = image;
        this.filters = new Filter[10];
        this.filterCount = 0;
    }

    public void showImageInfo() {
        System.out.println("Image Width: " + image.getWidth());
        System.out.println("Image Height: " + image.getHeight());
    }
}
