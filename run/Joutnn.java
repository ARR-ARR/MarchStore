package run;

import product.Laptop;
import product.Product;
import product.WriteProduct.LaptopReeder;
import product.WriteProduct.WRDBProduct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Joutnn {

    public String s = "nameProduct/Ноутбук brand/Irbis price/12499 description/<Процессор - Intel Atom, 4 ядра,RAM 2GB> article/1116";

    public static void main(String[] args) {
        String str = "Процессор - Intel Atom, 4 ядра,RAM 2GB";
        Laptop laptop = new Laptop();
        String CATALOG_NAME = "dataBaseFile/productDB.txt";
        WRDBProduct wrdbProduct = new WRDBProduct();

        wrdbProduct.dbReed();

        reedDescription(CATALOG_NAME);




    }

    private static void reedDescription(String CATALOG_NAME) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(CATALOG_NAME))) {
            List<Product> productList = new ArrayList<>();
            String currentLine = "";
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank())
                    productList.add(convertStringToProduct(currentLine));

            }

            System.out.println("****************");
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    private static Product convertStringToProduct(String currentLine) {
        String[] splitter = currentLine.split(" ");

        Laptop laptop = new Laptop();

        for (String s : splitter) {


            getDescriptionAndSet(s, laptop);


        }
        return laptop;
    }

  private static void getDescriptionAndSet(String s, Laptop laptop) {
        if (s != null && s.contains("description/")){
            while(s != ">"){
                s.replace(" ", "_");
            }

            laptop.setDescription(s.split("/")[1]);
        }
    }

}
