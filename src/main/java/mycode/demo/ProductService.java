package mycode.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductService {
    public List<Product> products = new ArrayList<>();

    public void loadProducts(){
        Product p1 = new Product();
        p1.id = 1;
        p1.sku = "SKU-001";
        p1.name = "Laptop";
        p1.price = 3999.99;
        p1.weight = 2.2;
        p1.descriptions = "Gaming laptop";
        p1.thumbnail = "laptop.jpg";
        p1.image = "laptop.jpg";
        p1.category = "Electronics";
        p1.createDate = "2025-12-01";
        p1.stock = 10;

        Product p2 = new Product();
        p2.id = 2;
        p2.sku = "SKU-002";
        p2.name = "Mouse";
        p2.price = 99.99;
        p2.weight = 0.2;
        p2.descriptions = "Wireless mouse";
        p2.thumbnail = "mouse.jpg";
        p2.image = "mouse.jpg";
        p2.category = "Electronics";
        p2.createDate = "2025-12-02";
        p2.stock = 50;

        Product p3 = new Product();
        p3.id = 3;
        p3.sku = "SKU-003";
        p3.name = "Running Shoes";
        p3.price = 599.99;
        p3.weight = 2;
        p3.descriptions = "Shoes";
        p3.thumbnail = "shoes.jpg";
        p3.image = "shoes.jpg";
        p3.category = "Sportware";
        p3.createDate = "2025-12-03";
        p3.stock = 100;

        Product p4 = new Product();
        p4.id = 4;
        p4.sku = "SKU-004";
        p4.name = "Iphone 16";
        p4.price = 4999.99;
        p4.weight = 0.350;
        p4.descriptions = "Iphone 16";
        p4.thumbnail = "iphone.jpg";
        p4.image = "iphone.jpg";
        p4.category = "Electronics";
        p4.createDate = "2025-12-04";
        p4.stock = 50;

        Product p5 = new Product();
        p5.id = 5;
        p5.sku = "SKU-005";
        p5.name = "LG SMART-TV";
        p5.price = 3999.99;
        p5.weight = 4;
        p5.descriptions = "LG SMART-TV";
        p5.thumbnail = "lgsmarttv.jpg";
        p5.image = "lgsmarttv.jpg";
        p5.category = "Electronics";
        p5.createDate = "2025-12-05";
        p5.stock = 100;

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
    }

    public Product getProductById(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).id==id){
                return products.get(i);
            }
        }
        return null;
    }

    public Product getProductBySku(String sku){
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if(p.sku != null && p.sku.equals(sku)){
                return p;
            }
        }
        return null;
    }


    public Product addProduct(Product p){
        p.id = generateId();
        products.add(p);
        return p;
    }

    public int generateId(){
        Random r = new Random();
        int id = r.nextInt(99999) + 1;
        while(getProductById(id) != null){
            id = r.nextInt(99999) + 1;
        }
        return id;
    }


    public List<Product> getProductsById(List<Integer> productsIds){
        List<Product> filteredProducts = new ArrayList<>();
        for(int i = 0; i < products.size(); i++){
            if(productsIds.contains(products.get(i).id)){
                filteredProducts.add(products.get(i));
            }
        }
        return filteredProducts;
    }
}
