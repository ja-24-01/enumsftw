public class Quality {

    public void controllRocket(Rocket testRocket) {
        RocketType type = testRocket.getRocketType();
        switch (type) {
            case SLOW:
                System.out.println("Du bist lahm");
                break;
            case FAST:
                System.out.println("Du bist schnell");
        }
    }
}
