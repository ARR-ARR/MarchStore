package product.WriteProduct;

import product.Laptop;

import java.util.Scanner;

public class LaptopReeder {

    public static void getTypeAndSet(String s, Laptop laptop) {
        if (s != null && s.contains("nameProduct/"))
            laptop.setNameProduct(s.split("/")[1]);
    }

    public static void getBrandAndSet(String s, Laptop laptop) {
        if (s != null && s.contains("brand/"))
            laptop.setBrand(s.split("/")[1]);
    }

    public static void getPriceAndSet(String s, Laptop laptop) {
        if (s != null && s.contains("price/"))
            laptop.setPrice(Integer.valueOf(s.split("/")[1]));
    }

    public static void getDescriptionAndSet(String s, Laptop laptop) {

        if (s != null && s.contains("description/")){
            laptop.setDescription(s.split("/")[1]);

        }
        //Scanner scan = new Scanner(s);
        //scan.useDelimiter("<");
        //laptop.setDescription(s.substring(s.indexOf('<'), s.indexOf('>')));
    }

    public static void getArticleAndSet(String s, Laptop laptop) {
        if (s != null && s.contains("article/"))
            laptop.setArticle(Integer.valueOf(s.split("/")[1]));
    }

}
