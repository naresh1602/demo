class Food{
    protected String name;

    public Food(String name) {
        this.name = name;
    }
}

class Fruit extends Food {
    private boolean isSweet;

    public Fruit(String name, boolean isSweet) {
        super(name);
        this.isSweet = isSweet;
    }

    public Fruit(String name) {
        super(name);
        this.isSweet = false;
    }

    public boolean isSweet() {
        return  isSweet;
    }
}
