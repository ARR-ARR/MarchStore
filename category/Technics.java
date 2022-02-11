package category;

import OnlineStore.OnlineStore;

public class Technics extends Category{
    private Phone phone;
    private OnlineStore onlineStore;


    public Technics(String nameCategory,OnlineStore onlineStore) {
        super(nameCategory);
        this.onlineStore = onlineStore;
        phone = new Phone("Телефоны");

    }

    public Phone getPhone() {
        return phone;
    }

    public OnlineStore getOnlineStore() {
        return onlineStore;
    }
}
