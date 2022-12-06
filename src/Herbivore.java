public class Herbivore extends Mammal {         //травоядные
    private final String foodType;

    public Herbivore(String nickname, int age, String environment, int movementSpeed, String foodType){
        super(nickname, age, environment, movementSpeed);
        this.foodType = foodType;
    }

    public void graze(){
        System.out.printf("%s grazws on %s\n?", this.getNickname(), this.foodType);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public String toString() {
        return super.toString() + ", вид питания - " + foodType + ".";
    }
}
