package subclasses;

import java.time.LocalDate;


public class Sale {

    private Product product;
    private int quantitySold;
    private LocalDate date;

    public Sale(){
    
    }
    public Sale(Product product, int quantitySold, LocalDate date) {
        this.product = product;
        this.quantitySold = quantitySold;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double calculateProfit() {
     
        double sellingPrice = product.getSellingp();
        double costPrice = product.getWholeSale();
        return (sellingPrice - costPrice) * quantitySold;
    }
    

}
