public class Robot {
    public int sensor;
    public int servo;
    public int power;

    public Robot() {
        sensor = 4;
        System.out.println("Jumlah Sensor Robot:\n");

    }
}
        class Asimo17 extends Robot {
            public int Kamera;

            public Asimo17(int m, int a, int u, int d) {
                sensor = m;
                servo = a;
                power = u;
                Kamera = d;
            }

            public void CetakSpesifikasi() {
                System.out.println("Jumlah Sensor Asimo17:" + sensor);
                System.out.println("Jumlah Servo: " + servo);
                System.out.println("Kapasitas Power: " + power);
                System.out.println("Jumlah Kamera :+\n");
            }

            public void Upgrade(int m) {
                sensor = m;
                System.out.println("Asimo17 diupgrade dengan sensor:" + sensor);

            }
        }




