package OOP.OOP_Static_Train;

public class bankTest {
    public static void main(String[] args) {
        band xh = new band(1, "xh", "123214");
        band xd = new band(2, "xd", "12awd214");

        band.setRent("2.1%");
        band.setMinMonnney(100.15);

        System.out.println(xh +""+band.minMonnney);
        System.out.println(xd );

    }
}
