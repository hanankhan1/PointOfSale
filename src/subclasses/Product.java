package subclasses;

public class Product {

    private int pid;
    private String name;
    private double stock;
    private double wholeSale;
    private double sellingp;
    private String catagory;
  
    public Product() {

    }

    public Product(int pid, String name, double stock, double wholeSale, double sellingp, String catagory) {
        this.pid = pid;
        this.name = name;
        this.stock = stock;
        this.wholeSale = wholeSale;
        this.sellingp = sellingp;
        this.catagory = catagory;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public double getWholeSale() {
        return wholeSale;
    }

    public void setWholeSale(double wholeSale) {
        this.wholeSale = wholeSale;
    }

    public double getSellingp() {
        return sellingp;
    }

    public void setSellingp(double sellingp) {
        this.sellingp = sellingp;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

}
