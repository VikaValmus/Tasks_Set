package epam.st.com.home;

public class DepartureDayTime {

    private final String dayOfWeek;

    private final Time time;

    static class Time {
        private final int hour;

        private final int minutes;

        public Time(String time) {
            String[] splitTime = time.split("\\.");
            hour = Integer.parseInt(splitTime[0]);
            minutes = Integer.parseInt(splitTime[1]);
        }

        public boolean isAfter(Time time) {
            return hour > time.hour || (hour == time.hour && minutes >= time.minutes);
        }

        public boolean isBefore(Time time) {
            return !isAfter(time);
        }

        @Override
        public String toString() {
            return prettyFormat(hour) + "." + prettyFormat(minutes);
        }

        private String prettyFormat(int val) {
            return val < 10 ? "0" + val : String.valueOf(val);
        }
    }

    public DepartureDayTime(String dayOfWeek, String time) {
        this.dayOfWeek = dayOfWeek;
        this.time = new Time(time);
    }

    public boolean isActual(String dayOfWeek, String from, String to) {
        if (!dayOfWeek.equals(this.dayOfWeek)) {
            return false;
        }
        Time timeFrom = new Time(from);
        Time timeTo = new Time(to);

        return this.time.isAfter(timeFrom) && this.time.isBefore(timeTo);
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public Time getTime() {
        return time;
    }
}
