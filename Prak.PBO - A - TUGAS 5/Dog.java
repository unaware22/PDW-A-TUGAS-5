class Dog extends Animal implements Pet {
    protected String name;

    public Dog() {
        super(4); // Dog memiliki 4 kaki
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " Bermain tangkap stik kayu");
    }

    @Override
    public void eat() {
        System.out.println(name + " Makan daging");
    }

    @Override
    public void walk() {
        System.out.println(name +" Jalan Bersama Tuannya");
    }
}