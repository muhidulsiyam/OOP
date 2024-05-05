public class point {
        private static int instanceCount = 0;
        private static final int MAX_INSTANCES = 2;

        private double x;
        private double y;

        public point(double x, double y) {
            if (instanceCount < MAX_INSTANCES) {
                this.x = x;
                this.y = y;
                instanceCount++;
            } else {
                throw new IllegalStateException("Cannot create more than " + MAX_INSTANCES + " instances of Point.");
            }
        }

        // Other methods and properties of the Point class go here

        public static void main(String[] args) {
            // Example usage:
            point p1 = new point(1.0,2.0);
            point p2 = new point(3.0,4.0);
            // Uncomment the line below to see the exception when creating a third instance:
            // Point p3 = new Point(5.0,6.0);
        }
    }
