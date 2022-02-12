package product;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Product{
    public Phone(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public Phone() {
    }
    List<Phone> phoneList = new ArrayList<>();
    
}
