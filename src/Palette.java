public class Palette {
    private Pixel[] pixels;
    private int size;
    private int capacity;

    public Palette(int initCapacity) {
        this.capacity = initCapacity;
        this.size = 0;
        this.pixels = new Pixel[capacity];
    }

    public Palette() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void clear() {
        pixels = new Pixel[capacity];
        size = 0;
    }
}
