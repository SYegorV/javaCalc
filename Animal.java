package company.com;

public enum Animal {
    TIGER("тигр"), // TIGER объект enum Animal
    CAT("кошка"),
    TURTLE("черепашка"),
    I("1"),
    II("2"),
    III("3"),
    IV("4"),
    V("5"),
    VI("6"),
    VII("7"),
    VIII("8"),
    IX("9"),
    X("10");

    String translation;

    Animal(String translation) { // конструктор
        this.translation = translation; // ключевое слово this для ссылки на объект
    }
    public String getTranslation() { // getTranslation() method
        return translation;     // вернет перевод
    }
    public String toString() { // toString() переопределили method
        return translation;     // вернет перевод
        //return "Перевод на русский язык "+translation;
    }
}
