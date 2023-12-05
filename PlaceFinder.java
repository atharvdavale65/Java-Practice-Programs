import java.util.*;

class Device {
    int id;
    Map<Integer, Pair<Integer, Double>> neighbors; // <Device ID, <Distance, Angle>>

    public Device(int id) {
        this.id = id;
        this.neighbors = new HashMap<>();
    }
}

class Pair<X, Y> {
    X first;
    Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }
}

public class PlaceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        Map<Integer, Device> devices = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int deviceId = scanner.nextInt();
            int numNeighbors = scanner.nextInt();

            Device device = new Device(deviceId);

            for (int j = 0; j < numNeighbors; j++) {
                int neighborId = scanner.nextInt();
                int distance = scanner.nextInt();
                double angle = Math.toRadians(scanner.nextDouble()); // Convert angle to radians

                device.neighbors.put(neighborId, new Pair<>(distance, angle));
            }

            devices.put(deviceId, device);
        }

        // Find distance between specific devices
        int deviceId1 = scanner.nextInt();
        int deviceId2 = scanner.nextInt();

        double distance = findDistance(devices, deviceId1, deviceId2);
        System.out.printf("%.2f", distance);

        scanner.close();
    }

    private static double findDistance(Map<Integer, Device> devices, int deviceId1, int deviceId2) {
        Device device1 = devices.get(deviceId1);
        Device device2 = devices.get(deviceId2);

        if (device1 == null || device2 == null) {
            return -1; // Invalid device IDs
        }

        // Check if devices are directly connected
        if (device1.neighbors.containsKey(deviceId2)) {
            return device1.neighbors.get(deviceId2).first;
        }

        // Check for common neighbors and calculate distance
        for (int commonNeighborId : device1.neighbors.keySet()) {
            if (device2.neighbors.containsKey(commonNeighborId)) {
                Pair<Integer, Double> info1 = device1.neighbors.get(commonNeighborId);
                Pair<Integer, Double> info2 = device2.neighbors.get(commonNeighborId);

                double distance1 = findDistance(devices, deviceId1, commonNeighborId);
                double distance2 = findDistance(devices, deviceId2, commonNeighborId);

                double angleDiff = Math.abs(info1.second - info2.second);

                // Custom distance calculation method (you may need to adjust this based on your requirements)
                double distance = Math.sqrt(Math.pow(distance1, 2) + Math.pow(distance2, 2) -
                        2 * distance1 * distance2 * Math.cos(angleDiff));

                return distance;
            }
        }

        return -1; // Devices are not directly or indirectly connected
    }
}
