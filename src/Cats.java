public class Cats extends Animals {
    public Cats (String name) {
        this.name = name;
        ANIMALS++;
        CATS++;
    }

    public void run(int num) {
        if (num <= 200) {
            System.out.println(this.name + " пробежал " + num + " м.");
        } else {
            System.out.println("Увы, но " + this.name + " не в силах пробежать " + num + " метров");
        }
    }

    public void swim(int num) {
            System.out.println(this.name + " не умеет плавать!!!");
    }
}
