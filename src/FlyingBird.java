public class FlyingBird extends Bird {           //летающие птицы

    private final String typeMovement;

    public FlyingBird (String nickname, int age, String environment, int movementSpeed, String typeMovement){
        super(nickname, age, environment);
        this.typeMovement = typeMovement;
    }

    public void fly(){
        System.out.printf("%s flys on %s\n?", this.getNickname(), this.typeMovement);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go(){

    }

    @Override
    public String toString() {
        return super.toString() + ", тип передвижения - " + typeMovement + ".";
    }
}