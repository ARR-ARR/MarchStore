package category;

public class Technics extends Category {
    private CatPhone catPhone;

    public Technics(String nameCategory) {
        super(nameCategory);
        catPhone = new CatPhone("Телефоны");

    }

    public CatPhone getPhone() {
        return catPhone;
    }

}
