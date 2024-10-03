abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Sedang berjalan " + legs + " Kaki");
    }

    public abstract void eat();
}