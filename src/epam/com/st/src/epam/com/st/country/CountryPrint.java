package epam.com.st.country;

public class CountryPrint {
    public static void printCapitalName(Country country) {
        System.out.println(country.getCapital().getName());
    }

    public static void printRegionsAmount(Country country) {
        System.out.printf("Regions amount = %d%n", country.getRegions().size());
    }

    public static void printCountrySquare(Country country) {
        System.out.printf("Country square = %f%n", country.getSquare());
    }

    public static void printCountryCenters(Country country) {
        System.out.print("Region centers: ");
        for (Region region : country.getRegions()) {
            System.out.print(region.getRegionCenter().getName() + ", ");
        }
    }
}
