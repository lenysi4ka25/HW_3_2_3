public abstract class Mammal extends Animal {  //Млекопитающие

    private final String environment;

    private final int movementSpeed;

    protected Mammal(String nickname, int age, String environment, int movementSpeed) {
        super(nickname, age);
        this.environment = environment;
        this.movementSpeed = movementSpeed;
    }
    public void stroll(){
        System.out.printf("%s strolls with %s speed in the %s\n", this.getNickname(), movementSpeed, environment);
    }

    @Override
    public String toString() {
        return super.toString() + "среда обитания - " + environment + ", скорость передвижения - " +  movementSpeed + " км/ч.";
    }
}
