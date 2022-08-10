package epam.st.com.home;

//Создать классAirline, спецификация которого приведена ниже.
//Определить конструкторы,set- иget- методы и методtoString().
//Создать второй класс, агрегирующий массив типаAirline, с подходящими конструкторами и методами.
//Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.util.Objects;

public class Airline {

    private String destination;
    private String flightNumber;
    private String aircraftType;
//    private String departureTime;
//    private String daysOfTheWeek;
    private DepartureDayTime departureDayTime;

    public Airline() {
        destination = " ";
        flightNumber = " ";
        aircraftType = " ";
//        departureTime = " ";
//        daysOfTheWeek = " ";
    }

    public Airline(String destination, String flightNumber, String aircraftType, String departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
//        this.departureTime = departureTime;
//        this.daysOfTheWeek = daysOfTheWeek;
        this.departureDayTime = new DepartureDayTime(daysOfTheWeek, departureTime);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
//        return departureTime;
        return departureDayTime.toString();
    }

    public String getDaysOfTheWeek() {
        return departureDayTime.getDayOfWeek();
    }

    public DepartureDayTime getDepartureDayTime() {
        return departureDayTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(destination, airline.destination) && Objects.equals(flightNumber, airline.flightNumber) && Objects.equals(aircraftType, airline.aircraftType) && Objects.equals(departureDayTime, airline.departureDayTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, aircraftType, departureDayTime);
    }

    @Override
    public String toString() {
        return "airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime='" + departureDayTime.getTime().toString() + '\'' +
                ", daysOfTheWeek='" + departureDayTime.getDayOfWeek() + '\'' +
                '}';
    }
}
