class BrightnessFilter extends Filter {
    private int level;

    public BrightnessFilter(int level) {
        this.level = level;
    }

    @Override
    public void apply() {
        System.out.println("Brightness Filter applied with level " + level);
    }

    public int getLevel() {
        return level;
    }
}