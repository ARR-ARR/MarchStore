package OnlineStore;

import category.Technics;

public class OnlineStore implements Info {
    private String nameStore;
    private Technics technics;

    public OnlineStore(String nameStore) {
        this.nameStore = nameStore;
       technics = new Technics("Техника",this);
    }

    public String getNameStore() {
        return nameStore;
    }

    public Technics getTechnics() {
        return technics;
    }

    @Override
    public void getContact() {
        System.out.println("Название магазина - "+nameStore+"\n"+"@ адрес - "+LINK+
                "\n"+"Телефон горячей линии - "+PHONE_NUMBER+"\n"+"Обратаня связь - "+FEEDBACK);
    }
}
