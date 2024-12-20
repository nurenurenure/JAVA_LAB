import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Контейнер для хранения базового и производного классов
        List<Filter> filters = new ArrayList<>();

        // Добавляем объекты в контейнер
        filters.add(new Filter());
        filters.add(new BrightnessFilter(5));
        filters.add(new BrightnessFilter(10));

        // Сортируем BrightnessFilter по уровню яркости (level)
        filters.sort((a, b) -> {
            if (a instanceof BrightnessFilter && b instanceof BrightnessFilter) {
                return Integer.compare(((BrightnessFilter) a).getLevel(), ((BrightnessFilter) b).getLevel());
            }
            return 0; // Базовые фильтры не сравниваются
        });

        // Применяем фильтры
        for (Filter filter : filters) {
            filter.apply();
        }

        // Поиск первого BrightnessFilter с level = 10
        Optional<Filter> result = filters.stream()
                .filter(f -> f instanceof BrightnessFilter && ((BrightnessFilter) f).getLevel() == 10)
                .findFirst();

        if (result.isPresent()) {
            System.out.println("Found BrightnessFilter with level 10");
        } else {
            System.out.println("BrightnessFilter with level 10 not found");
        }
    }
}