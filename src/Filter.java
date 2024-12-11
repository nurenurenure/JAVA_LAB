class Filter {
    public void apply(Image image) {
        System.out.println("Applying base filter");
    }

    public void baseApply(Image image) {
        apply(image);
    }
}

