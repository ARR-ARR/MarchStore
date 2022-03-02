package product.WriteProduct;


import product.Laptop;
import product.Product;
import product.bilder.LaptopBilder;
import product.bilder.SmartPhoneBilder;
import product.bilder.TVBilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WRDBProduct {

        private static String CATALOG_NAME = "dataBaseFile/productDB.txt";

    Scanner sc = new Scanner(System.in);


    LaptopReeder laptopReeder = new LaptopReeder();

    public static void dbWrite() {
        LaptopBilder laptopBilder = new LaptopBilder();
        laptopBilder.createLaptop();

        try (FileWriter fileWriteDB = new FileWriter(CATALOG_NAME)) {

            fileWriteDB.write(String.valueOf(laptopBilder.laptopList));
            fileWriteDB.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dbReed() {
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
            e.printStackTrace();
        }


    }

    private Product convertStringToProduct(String currentLine) {
        String[] splitter = currentLine.split(" ");

        Laptop laptop = new Laptop();

        for (String s : splitter) {
            laptopReeder.getTypeAndSet(s, laptop);
            laptopReeder.getBrandAndSet(s, laptop);
            laptopReeder.getPriceAndSet(s, laptop);
            laptopReeder.getDescriptionAndSet(s, laptop);
            laptopReeder.getArticleAndSet(s, laptop);

        }
        return laptop;
    }




}
