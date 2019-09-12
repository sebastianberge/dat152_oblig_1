package no.hvl.dat152;

public class Cart {
    public Product product[];
    public int quantity;

    public Cart() {
        quantity = 0;
        product = new Product[10];
    }

    public void addProduct(Product newProduct) {
        product[quantity] = newProduct;
        quantity++;
    }
}