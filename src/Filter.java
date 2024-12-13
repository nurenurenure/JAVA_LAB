class Filter {
    protected String name;

    // Конструктор базового класса
    public Filter(String filterName) {
        this.name = filterName;
        System.out.println("Filter base class constructor called: " + name);
    }
    public void apply() {
        System.out.println("Applying base filter: " + name);
    }

}

