import java.util.Objects;

public abstract class Animal {  //животные
    private String nickname;
    private int age;

    protected Animal(String nickname, int age) {
        this.nickname = ValidationUtils.validOrDefault(nickname, "default");
        this.age = Math.max(age, 0);
    }
    public abstract void eat();

    public void sleep() {
        System.out.printf("%s sleeps\n", this.nickname);
    }

    public abstract void go ();

    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }

    @Override
    public String toString() {
        return "Название животного - " +
                nickname +
                ", возраст - " + age +
                " лет, ";
    }
}
