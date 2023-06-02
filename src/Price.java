public class Price {
    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(10.99);

        double singlePrice = product.getPrice();
        System.out.println("Single Price: " + singlePrice);

        int quantity = 5;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Total Price for " + quantity + " items: " + totalPrice);
    }
}
