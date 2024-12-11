public class Main {
    public static void main(String[] args) {
        // Создаем изображение
        Image image = new Image(3, 3);
        image.setPixel(0, 0, new Pixel(100, 150, 200));
        image.setPixel(1, 0, new Pixel(120, 170, 220));
        image.setPixel(2, 0, new Pixel(140, 190, 240));

        // Используем базовый класс
        Filter baseFilter = new Filter();
        baseFilter.baseApply(image);

        // Используем дочерний класс BrightnessFilter через базовый указатель
        Filter brightnessFilter = new BrightnessFilter(50);
        brightnessFilter.baseApply(image); // Вызов через базовый класс

        // Пример работы с не виртуальным методом (если apply не переопределен)
        Filter simpleFilter = new Filter();
        simpleFilter.apply(image); // Всегда вызов базового метода
    }
}