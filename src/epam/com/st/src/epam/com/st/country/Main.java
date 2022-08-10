package epam.com.st.country;

import java.util.ArrayList;
import java.util.List;

import static epam.com.st.country.CountryPrint.printCapitalName;
import static epam.com.st.country.CountryPrint.printCountryCenters;
import static epam.com.st.country.CountryPrint.printCountrySquare;
import static epam.com.st.country.CountryPrint.printRegionsAmount;

public class Main {
    public static void main(String[] args) {
        Country country = createCountry();
        printCapitalName(country);
        printRegionsAmount(country);
        printCountrySquare(country);
        printCountryCenters(country);
    }

    private static Country createCountry() {
        City capital = new City("Minsk");

        List<City> firstDistrictCities = new ArrayList<>();
        firstDistrictCities.add(capital);
        firstDistrictCities.add(new City("Slyck"));
        firstDistrictCities.add(new City("Logojsk"));

        List<City> secondDistrictCities = new ArrayList<>();
        secondDistrictCities.add(new City("Brest"));
        secondDistrictCities.add(new City("Baranovichi"));

        List<City> thirdDistrictCities = new ArrayList<>();
        thirdDistrictCities.add(new City("Vitebsk"));
        thirdDistrictCities.add(new City("Polotsk"));

        List<City> fourthDistrictCities = new ArrayList<>();
        fourthDistrictCities.add(new City("Mogilev"));
        fourthDistrictCities.add(new City("Glysk"));

        List<District> firstRegionDistricts = new ArrayList<>();
        firstRegionDistricts.add(new District(firstDistrictCities));

        List<District> secondRegionDistricts = new ArrayList<>();
        secondRegionDistricts.add(new District(secondDistrictCities));

        List<District> thirdRegionDistricts = new ArrayList<>();
        thirdRegionDistricts.add(new District(thirdDistrictCities));

        List<District> fourthRegionDistricts = new ArrayList<>();
        fourthRegionDistricts.add(new District(fourthDistrictCities));


        List<Region> regions = new ArrayList<>();
        regions.add(new Region(firstRegionDistricts, capital, 500.55));
        regions.add(new Region(secondRegionDistricts, new City("Brest"), 500.55));
        regions.add(new Region(thirdRegionDistricts, new City("Vitebsk"), 500.55));
        regions.add(new Region(fourthRegionDistricts, new City("Mogilev"), 500.55));

        return new Country("Belarus", capital, regions);
    }
}
