package epam.com.st.home;

//Описать класс, представляющий треугольник.
//Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан (опционально).

import java.util.Objects;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }


    public int perimeterOfTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    public double areaOfTriangle(int sideA, int sideB, int sideC, int perimeter) {

        int semiPerimeter = perimeterOfTriangle(sideA, sideB, sideC) / 2;
        double height = 2 * Math.sqrt((semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))) / sideA;
        return 0.5 * height * sideA;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
