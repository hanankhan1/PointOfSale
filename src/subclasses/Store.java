package subclasses;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Store {
    
    private static ArrayList<Product> products;
    private static ArrayList<Employe> employes;
    private static ArrayList<Sale>sales;
    
    public static  void dummyemp(){
    employes.add(new Employe("ali","123","Fav Place ","city"));
    }
    public static void dummyProducts() {
        products.add(new Product(1, "nescafe", 50, 50, 100, "Cofee"));
        products.add(new Product(2, "fizz up", 500, 100, 150, "Soft Drinks"));
        products.add(new Product(3, "aqafena", 500, 100, 140, "Water"));
        products.add(new Product(4, "lays", 300, 50, 100, "Snaks"));
        products.add(new Product(5, "kit kat", 200, 250, 300, "Choclates"));
        products.add(new Product(6, "dairy milk", 150, 50, 100, "Choclates"));
        products.add(new Product(7, "Ice loli", 250, 50, 100, "Ice Cream"));
        products.add(new Product(8, "Feast", 250, 150, 200, "Ice Cream"));
        products.add(new Product(9, "Arial", 550, 350, 400, "washing powder"));
        products.add(new Product(10, "pound", 150, 250, 300, "Body wash"));
        products.add(new Product(11, "life boy", 250, 50, 80, "soup"));
        products.add(new Product(12, "pound men", 150, 250, 290, "Face wash"));
        
    }
    
    static {
        products = new ArrayList();
        employes = new ArrayList();
        sales=new ArrayList();
    }
    public static String frpass(String uname, String uqestion, String uans) {
        for (int i = 0; i < employes.size(); i++) {
            if (uname.equals(employes.get(i).getEname())
                    && uqestion.equals(employes.get(i).getEquestion())
                    && uans.equals(employes.get(i).getEanswer())) {
                return employes.get(i).getEpass();
            }
        }
        return "";
    }
    public static double dalyPro(LocalDate date) {
        double profit = 0;
        for (Sale sale : sales) {
            if (sale.getDate().equals(date)) {
                profit += sale.calculateProfit();
            }
        }
        return profit;
    }
 
   public static double monthlyPro(int month, int year) {
        double profit = 0;
        for (Sale sale : sales) {
            if (sale.getDate().getMonthValue() == month && sale.getDate().getYear() == year) {
                profit += sale.calculateProfit();
            }
        }
        return profit;
    }
    
    public static boolean ematch(String uname, String upass) {
        for (int i = 0; i < employes.size(); i++) {
            if (uname.equals(employes.get(i).getEname()) && upass.equals(employes.get(i).getEpass())) {
                return true;
            }
        }
        return false;
    }
    
    public static void addEmployee(Employe e) {
        if (e != null) {
            employes.add(e);
            
        } else {
            JOptionPane.showMessageDialog(null, "Employe data is not recived ..!");
        }
    }
    
    public static void addProduct(Product obj) {
        if (obj != null) {
            products.add(obj);
            
        } else {
            JOptionPane.showMessageDialog(null, "Product data is not recived ..!");
        }
    }
    
    public static ArrayList<Product> getAllProducts() {
        return products;
    }
    public static ArrayList<Employe> getAllEmployes() {
        return employes;
    }
    public static Employe searchByNameEmp(String name) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getEname().equalsIgnoreCase(name)) {
                return employes.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Product not found..!");
        return null;
    }
    public static Product searchByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                return products.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Product not found..!");
        return null;
    }
    
    public static void showMsgError(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
     public static void deletemp(Employe obj) {
        employes.remove(obj);
        showMsgError("Delete succfully..!");
    }
    public static void deletpro(Product obj) {
        products.remove(obj);
        showMsgError("Delete succfully..!");
    }
    
    public static void update(int id, Product obj) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPid() == id) {
                products.get(i).setName(obj.getName());
                products.get(i).setStock(obj.getStock());
                products.get(i).setWholeSale(obj.getWholeSale());
                products.get(i).setSellingp(obj.getSellingp());
                products.get(i).setCatagory(obj.getCatagory());
                showMsgError("Prodcut updated succeffuly..!");
            }
            
        }
    }

    public static ArrayList<Sale> getAllSales() {
        return sales;
    }
    
}
