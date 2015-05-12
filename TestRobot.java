public class TestRobot {
    public static void main(String[] args)
    {
        Asimo17 unit = new Asimo17(30, 150, 1000, 5);
        unit.CetakSpesifikasi();
        unit.Upgrade(20);
        unit.Upgrade(25);

    }
}