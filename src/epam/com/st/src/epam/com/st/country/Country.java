package epam.com.st.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private String name;

    private City capital;

    private List<Region> regions;

    public Country() {
        regions = new ArrayList<Region>();
    }

    public Country(String name, City capital, List<Region> regions) {
        this.regions = new ArrayList<Region>();
        this.regions.addAll(regions);
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public boolean add(Region region) {
        regions.add(region);
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(capital, country.capital) && Objects.equals(regions, country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, regions);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }

    public City getCapital() {
        return capital;
    }

    public double getSquare() {
        double resultSquare = 0;
        for (Region region : regions) {
            resultSquare += region.getSquare();
        }

        return resultSquare;
    }
}
