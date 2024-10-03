public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.eat();
        spider.walk();
        System.out.println();

        Dog dogy = new Dog();
        dogy.setName("Doggy");
        System.out.println("Nama Anjing: " + dogy.getName());
        dogy.play();
        dogy.eat();
        dogy.walk();
        System.out.println();

        Cat kucingOren = new Cat("Kucing Oren");
        System.out.println("Nama Kucing: " + kucingOren.getName());
        kucingOren.play();
        kucingOren.eat();
        kucingOren.walk();
    }
}