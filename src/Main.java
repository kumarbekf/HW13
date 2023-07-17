public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kanybai", "Asanov");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();
        Programmer programmer = new Programmer("Kumarbek ", "Pragramist ", "Google ");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        Dancer dancer = new Dancer("Kumarbek ", "a dance ", "Иish shymkent ");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        Singer singer = new Singer("Kumarbek ", "git ", "gitara chertet ");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
    }
}