package mycode.demo;


    public class Product {
        public int id;
        public String sku;
        public String name;
        public double price;
        public double weight;
        public String descriptions;
        public String thumbnail;
        public String image;
        public String category;
        public String createDate;
        public int stock;

        public String descriptionProduct(){
            String s = "";
            s += "Product ID: " + id + "\n";
            s += "SKU: " + sku + "\n";
            s += "Name: " + name + "\n";
            s += "Price: " + price + "\n";
            s += "Weight: " + weight + "\n";
            s += "Descriptions: " + descriptions + "\n";
            s += "Thumbnail: " + thumbnail + "\n";
            s += "Image: " + image + "\n";
            s += "Category: " + category + "\n";
            s += "Create date: " + createDate + "\n";
            s += "Stock: " + stock + "\n";
            return s;
        }


}
