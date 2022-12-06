public class Main {
    public static void main(String[] args) {
        Herbivore gazel = new Herbivore ("Газель", 3, "Африка", 50, "трава");
        Herbivore giraf = new Herbivore ("Жираф", 7, "Африка", 55, "трава");
        Herbivore loshad = new Herbivore ("Лошадь", 10, "Россия", 60, "трава");
        Predator giena = new Predator("Гиена", 5, "Африка", 60, "мясо");
        Predator tigr = new Predator("Тигр", 5, "Африка", 65, "мясо");
        Predator medved = new Predator("Медведь", 4, "Россия", 40, "рыба, мясо");
        Amphibian liagyshka = new Amphibian("Лягушка", 1, "болото");
        Amphibian yg = new Amphibian("Уж пресноводный", 2, "лес");
        NotFlyingBird pavlin = new NotFlyingBird("Павлин", 4, "остров Ява", 2, "неспешная прогулка");
        NotFlyingBird pingvin = new NotFlyingBird("Пингвин", 1, "Арктика", 2, "неспешная прогулка");
        NotFlyingBird dodo = new NotFlyingBird("Додо", 7, "Маврикия", 30, "неспешная прогулка");
        FlyingBird chaika = new FlyingBird("Чайка", 4, "Арктика", 50, "полет");
        FlyingBird albatros = new FlyingBird("Альбатрос", 3, "Южном океане и в северной части Тихого океана", 80, "полет");
        FlyingBird sokol = new FlyingBird("Сокол", 10, "Россия", 320, "полет");

        System.out.println(gazel);
        System.out.println(giraf);
        System.out.println(loshad);
        System.out.println(giena);
        System.out.println(tigr);
        System.out.println(medved);
        System.out.println(liagyshka);
        System.out.println(yg);
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(dodo);
        System.out.println(chaika);
        System.out.println(albatros);
        System.out.println(sokol);
    }
}