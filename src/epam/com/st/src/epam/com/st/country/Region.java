package epam.com.st.country;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private List<District> districts;

    private City regionCenter;

    private double square;

    public Region() {
        districts = new ArrayList<District>();
        square = 0;
    }

    public Region(List<District> areas, City regionCenter, double square) {
        districts = new ArrayList<District>();
        districts.addAll(areas);
        this.regionCenter = regionCenter;
        this.square = square;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Region{" +
                "districts=" + districts +
                ", regionCenter=" + regionCenter +
                ", square=" + square +
                '}';
    }
}
