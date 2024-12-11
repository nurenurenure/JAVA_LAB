// Дочерний класс BrightnessFilter
class BrightnessFilter extends Filter {
    private int brightnessLevel;

    public BrightnessFilter(int level) {
        this.brightnessLevel = level;
    }

    public void apply(Image image) {
        System.out.println("Applying brightness filter with level: " + brightnessLevel);
    }
}

