package part2.demo3;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(2);
        cy.setLength(2);

//        double volume = cy.findVolume();
//        System.out.println("圆柱的体积为：" + volume);
        System.out.println("圆柱的体积为：" + cy.findVolume());

        System.out.println("-------------------------");

//        double area = cy.findArea();
//        System.out.println("圆柱的底面积为：" + area);
        System.out.println("圆柱的底面积为：" + cy.findArea());
    }
}
