public class Amphibian extends Animal {         //Земноводные
    private final String environment;

    public Amphibian(String nickname, int age, String environment) {
        super(nickname, age);
        this.environment = environment;
    }


    public void hunt(){
        System.out.printf("%s hunts in %s\n", this.getNickname(), this.environment);
    }

    @Override
    public void eat(){


    }
    @Override
    public void go(){

    }
}