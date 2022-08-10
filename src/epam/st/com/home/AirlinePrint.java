package epam.st.com.home;

import java.util.List;

public class AirlinePrint {
    public void printTheBestAirline(List<Airline> airlineList) {
        for (Airline air : airlineList) {
            System.out.println(air);
        }
    }
}
