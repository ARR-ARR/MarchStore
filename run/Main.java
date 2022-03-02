package run;


import product.WriteProduct.WRDBProduct;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WRDBProduct fwDB = new WRDBProduct();


        //fwDB.dbWrite();
        //fwDB.dbReed();




        String description = "Процессор_-_Intel_Atom,_4_ядра,RAM_2G".replace('_', ' ');
        System.out.println(description);


    }
}
