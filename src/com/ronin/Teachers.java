package com.ronin;

public class Teachers {

    String name;
    String surname;

    public void create_teacher(String name, String surname){
        this.name=name;
        this.surname=surname;

        System.out.println(name + " " + surname);

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


}
