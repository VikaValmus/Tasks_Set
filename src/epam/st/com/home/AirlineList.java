package epam.st.com.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineList {

    private List<Airline> airlineList;

    public AirlineList(){
        airlineList = new ArrayList<Airline>();
    }

    public void add(Airline airline){
        airlineList.add(airline);
    }

    public List<Airline> getAirlineList() {
        return airlineList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineList that = (AirlineList) o;
        return Objects.equals(airlineList, that.airlineList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineList);
    }
}
