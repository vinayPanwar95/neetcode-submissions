class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        List<double[]> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            cars.add(new double[]{position[i], time});
        }

        // sort by position descending
        cars.sort((a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double maxTime = 0;

        for (double[] car : cars) {
            double time = car[1];

            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }

        return fleets;
    }
}