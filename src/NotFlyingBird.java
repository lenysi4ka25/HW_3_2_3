public class NotFlyingBird extends Bird {            //нелетающие птицы

    private final String typeMovement;

    public NotFlyingBird (String nickname, int age, String environment, int movementSpeed, String typeMovement){
        super(nickname, age, environment);
        this.typeMovement = typeMovement;
    }

    public void walk(){
        System.out.printf("%s walks on %s\n?", this.getNickname(), this.typeMovement);
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
