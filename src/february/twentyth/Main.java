package february.twentyth;

public class Main {
    public static void main(String[] args) {
//        watermelon melon = new watermelon();//upcastin
//
//        melon.tasty();
//        melon.seed();
//
//        seedlessmelon seedlessmelon = (seedlessmelon) melon;
//        //melon = seedlessmelon;
//
//        seedlessmelon.tasty();
//        seedlessmelon.seed();


        watermelon melon = new seedlessmelon(); // 업캐스팅
        melon.tasty();
        melon.seed();

        melon w = new watermelon(); // 업캐스팅으로 melon으로 선언된 w는 watermelon이 됨

        melon = (watermelon) w;

        melon.seed();
        melon.tasty();
    }
}



