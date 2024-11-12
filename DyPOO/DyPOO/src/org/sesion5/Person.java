package org.sesion5;

public class Person {
    private String name;
    private int age;

    public Person() {
        name = "Default";
        age = 0;
    }

    /* this sirve para acceder a los atributos de la misma clase
    * La sobre carga es cuando se usa un método o constructor con el mismo nombre y se cambian los argumentos */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
