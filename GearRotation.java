import java.util.Scanner;

class Gear {
    double x, y, rr;

    public Gear(double x, double y, double rr) {
        this.x = x;
        this.y = y;
        this.rr = rr;
    }
}

public class GearRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Gear[] gears = new Gear[N];

        for (int i = 0; i < N; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double rr = scanner.nextDouble();

            gears[i] = new Gear(x, y, rr);
        }

        double rotations = calculateRotations(gears);

        if (rotations != -1) {
            System.out.printf("%.2f", rotations);
        } else {
            System.out.println("Could Not Process");
        }

        scanner.close();
    }

    private static double calculateRotations(Gear[] gears) {
        int lastGearIndex = gears.length - 1;

        for (int i = 0; i < lastGearIndex; i++) {
            double n1 = 1.0;
            double n2 = n1 * gears[i].rr / gears[i + 1].rr;

            if (i % 2 == 0) {
                n2 = -n2; // Change direction for even-indexed gears
            }

            gears[i + 1].rr = n2;
        }

        return gears[lastGearIndex].rr;
    }
}
