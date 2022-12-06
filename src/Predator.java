public class Predator  extends Mammal{     //Хищники

    private final String foodType;

    public Predator(String nickname, int age, String environment, int movementSpeed, String foodType){
        super(nickname, age, environment, movementSpeed);
        this.foodType = foodType;
    }

    public void hunt(){
        System.out.printf("%s hunts on %s\n?", this.getNickname(), this.foodType);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go(){

    }

    @Override
    public String toString() {
        return super.toString() + ", вид питания - " + foodType + ".";
    }
}
