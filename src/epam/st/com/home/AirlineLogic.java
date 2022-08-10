package epam.st.com.home;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {
    public List<Airline> airlineListGivenDestination(List<Airline> airlineList, String destination) {
        List<Airline> airlineListGivenDestination = new ArrayList<>();
        for (Airline air : airlineList) {
            if (air.getDestination().equals(destination)) {
                airlineListGivenDestination.add(air);
            }
        }
        return airlineListGivenDestination;
    }

    public List<Airline> airlineListGivenDaysOfTheWeek(List<Airline> airlineList, String daysOfTheWeek) {
        List<Airline> airlineListGivenDaysOfTheWeek = new ArrayList<>();
        for (Airline airDaysOfTheWeek : airlineList) {
            if (airDaysOfTheWeek.getDaysOfTheWeek().equals(daysOfTheWeek)) {
                airlineListGivenDaysOfTheWeek.add(airDaysOfTheWeek);
            }
        }
        return airlineListGivenDaysOfTheWeek;
    }

    public List<Airline> airlineListGivenDaysOfTheWeekDepartureTime(List<Airline> airlineList, String daysOfTheWeek, String from, String to) {
//        for (Airline st:airlineList) {
//            st = airlineList.get(Integer.parseInt(departureTime));
//            System.out.println(st);
//        }
//        char[] time = departureTime.toCharArray();
//
//
//        List<Airline> airlineListGivenDaysOfTheWeekDepartureTime = new ArrayList<>();
//
//
//
//        return airlineListGivenDaysOfTheWeekDepartureTime;

        List<Airline> chosenAirlines = new ArrayList<>();
        for (Airline airline : airlineList) {
            if (airline.getDepartureDayTime().isActual(daysOfTheWeek, from, to)) {
                chosenAirlines.add(airline);
            }
        }
        return chosenAirlines;
    }
}
