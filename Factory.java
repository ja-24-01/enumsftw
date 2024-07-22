
public class Factory {

    public static void main(String[] args) {

        Rocket rocket = build();
        Quality qa = new Quality();
        checkRocketType(rocket);
        qa.controllRocket(rocket);

    }

    private static void checkRocketType(Rocket rocket) {
        if (rocket.getRocketType() == RocketType.SLOW) {
            System.out.println("Runter von der linken Spur");
        } else {
            System.out.println("Boahh ist die schnellllllllll");
        }
    }

    public static Rocket build() {
        return new Rocket(RocketType.FAST);
    }
}