package demo8;

public class b_TriAngleTest {
    public static void main(String[] args) {
        TriAngle area = new TriAngle(2, 3);
        area.setBase(2.3);
        area.setHeight(4.2);
        System.out.println("底边：" + area.getBase() + ",高：" + area.getHeight());
    }

    public static class TriAngle {
        private double base;
        private double height;

        public TriAngle() {

        }

        public TriAngle(double b, double h) {
            base = b;
            height = h;
        }

        public void setBase(double b) {
            base = b;
        }

        public double getBase() {
            return base;
        }

        public void setHeight(double h) {
            height = h;
        }

        public double getHeight() {
            return height;
        }
    }
}
