package epam.com.st.home;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5, 15);

        int perimeter = triangle.perimeterOfTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC());
        System.out.println("perimeter of a triangle = " + perimeter);

        double area = triangle.areaOfTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC(), perimeter);
        System.out.println("area of a triangle = " + area);

    }
}
