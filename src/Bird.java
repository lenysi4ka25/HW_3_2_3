public abstract class Bird extends Animal {         //птицы

    private final String environment;

    protected Bird(String nickname, int age, String environment) {
        super(nickname, age);
        this.environment = environment;

    }
    public void walk(){
        System.out.printf("%s walks with %s speed in the %s\n", this.getNickname(), environment);
    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания - " + environment;
    }
}