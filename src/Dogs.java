public class Dogs  extends Animals {
    public Dogs (String name) {
        this.name = name;
        ANIMALS++;
        DOGS++;
    }

    public void run(int num) {
        if (num <= 500) {
            System.out.println(this.name + " пробежал " + num + " м.");
        } else {
            System.out.println("Увы, но " + this.name + " не в силах пробежать " + num + " метров");
        }
    }

    public void swim(int num) {
        if (num <= 10) {
            System.out.println(this.name + " проплыл " + num + " м.");
        } else {
            System.out.println("Увы, но " + this.name + " не в силах проплыть " + num + " метров");
        }
    }
}
