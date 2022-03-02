package run;

import product.Laptop;
import product.Product;
import product.WriteProduct.LaptopReeder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseDelemiter {
    public static void main(String[] args) {

        String CATALOG_NAME = "dataBaseFile/productDB123.txt";



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

    private static Product convertStringToProduct(String currentLine) {

        String[] splitter = currentLine.split(" ");

        Laptop laptop = new Laptop();


        for (String s : splitter) {

            getDescriptionAndSet(s, laptop);

        }
        return laptop;
    }

    public static void getDescriptionAndSet(String s, Laptop laptop) {

        if (s != null && s.contains("description/")){
            Scanner scan = new Scanner(s);
            scan.useDelimiter(">");
        }
        laptop.setDescription(s.split("/")[1]);
        //laptop.setDescription(s.substring(s.indexOf('<'), s.indexOf('>')));


    }

}
