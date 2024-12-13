public class BlackAndWhiteFilter extends Filter{
    // Конструктор производного класса
    public BlackAndWhiteFilter(String filterName, int level) {
        super(filterName); // Вызов конструктора базового класса
        this.brightnessLevel = level;
        System.out.println("BrightnessFilter derived class constructor called with level: "
                + brightnessLevel);
    }
    private int brightnessLevel;
    public void apply() {
        System.out.println("Applying brightness filter: " + name
                + " with level " + brightnessLevel);
    }
}
