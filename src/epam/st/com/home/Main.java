package epam.st.com.home;

import java.time.Clock;
import java.time.Instant;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AirlineList airlineList = new AirlineList();

        airlineList.add(new Airline("Poland", "1354AC", "Пасажирский", "00.01", "Monday"));
        airlineList.add(new Airline("Belarus", "2345fd", "Пасажирский", "09.15", "Tuesday"));
        airlineList.add(new Airline("Poland", "2352jb", "Пасажирский", "10.35", "Wednesday"));
        airlineList.add(new Airline("Belarus", "9876fj", "Пасажирский", "13.15", "Monday"));
        airlineList.add(new Airline("Poland", "46785C", "Пасажирский", "20.15", "Tuesday"));

        AirlineLogic airlineLogic = new AirlineLogic();
        AirlinePrint airlinePrint = new AirlinePrint();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите заданный пункт назначения");
        String destination = "Poland";
        List<Airline> airlineListGivenDestination = airlineLogic.airlineListGivenDestination(airlineList.getAirlineList(), destination);
//        airlinePrint.printTheBestAirline(airlineListGivenDestination);

//        System.out.println("Введите день недели");
        String daysOfTheWeek = "Monday";
        List<Airline> airlineListGivenDaysOfTheWeek = airlineLogic.airlineListGivenDaysOfTheWeek(airlineList.getAirlineList(), daysOfTheWeek);
//        airlinePrint.printTheBestAirline(airlineListGivenDaysOfTheWeek);

//        System.out.println("Введите день недели");
        String from = "00.00";
        String to = "14.15";
        List<Airline> chosenAirLines = airlineLogic.airlineListGivenDaysOfTheWeekDepartureTime(airlineList.getAirlineList(), daysOfTheWeek, from, to);
        airlinePrint.printTheBestAirline(chosenAirLines);
    }
}

