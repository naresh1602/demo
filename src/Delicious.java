public class Delicious {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", true);
        System.out.println("Name: " + apple.name);
        System.out.println("Is Sweet: " + apple.isSweet());

        Fruit lemon = new Fruit("Lemon");
        System.out.println("Name: " + lemon.name);
        System.out.println("Is Sweet: " + lemon.isSweet());
    }

}
