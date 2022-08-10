package epam.com.st.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
    private List<City> districtCities;

    public District() {
        districtCities = new ArrayList<City>();
    }

    public District(List<City> districtCities) {
        this.districtCities = new ArrayList<City>();
        this.districtCities.addAll(districtCities);
    }

    public List<City> getDistrictCities() {
        return districtCities;
    }

    public void setDistrictCities(List<City> districtCities) {
        this.districtCities = districtCities;
    }

    public void add(City city) {
        districtCities.add(city);
    }

    public boolean add(int index, City city) {
        if (index < 0 || index > districtCities.size()) {
            return false;
        }
        districtCities.add(index, city);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District area1 = (District) o;
        return Objects.equals(districtCities, area1.districtCities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtCities);
    }

    @Override
    public String toString() {
        return "District{" +
                "districtCities=" + districtCities +
                '}';
    }
}
