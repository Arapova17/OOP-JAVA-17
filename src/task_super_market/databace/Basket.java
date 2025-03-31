package task_super_market.databace;

import task_super_market.models.Product;

public class Basket {
    private Product[] products;

    public Basket (Product[] products){
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getTotalPrice(){
        System.out.println("Product: ");
        double sum = 0;
        for (Product product : products){
            System.out.println(product);
            sum += product.price();
        }

        return sum;
    }
}
