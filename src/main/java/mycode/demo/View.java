package mycode.demo;

import java.util.Scanner;

public class View {
    public ProductService productService = new ProductService();

    Scanner sc = new Scanner(System.in);

    public void loadData(){
        productService.loadProducts();
        play();
    }

    public void meniu(){
        System.out.println("\n=== ONLINE SHOP ===");
        System.out.println("1 - Show products");
        System.out.println("2 - Add product");

    }

    public void play(){
        loadData();

        while(true){
            meniu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProduct();
                    break;


                default:
                    System.out.println("Invalid option!");
            }
        }
    }



    public void showProducts(){
        System.out.println("=== PRODUCT LIST ===");
        for(int i = 0; i < productService.products.size(); i++){
            Product p = productService.products.get(i);
            System.out.println(p.descriptionProduct());
            System.out.println("--------");
        }
    }

    public void addProduct(){

        Product p = new Product();

        System.out.println("Enter SKU:");
        p.sku = sc.nextLine();

        if(productService.getProductBySku(p.sku) != null){
            System.out.println("SKU already exists!");
            return;
        }

        System.out.println("Enter name:");
        p.name = sc.nextLine();

        System.out.println("Enter price:");
        p.price = Double.parseDouble(sc.nextLine());

        System.out.println("Enter stock:");
        p.stock = Integer.parseInt(sc.nextLine());

        productService.addProduct(p);
        System.out.println("Product added with ID: " + p.id);
    }





}
