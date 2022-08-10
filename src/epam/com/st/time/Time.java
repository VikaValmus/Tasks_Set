package epam.com.st.time;

//Составьте описание класса для представления времени.
//Предусмотрте возможности установки времени и изменения его
//отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений.
//В случае недопустимых значений полей поле устанавливается в значение 0.
//Создать методы изменения времени на заданное количество часов, минут и секунд.

import java.util.Objects;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean validationOfInputValues(int hour, int minute, int second) {
        return hour >= 0 && hour <= 24 && minute >= 0 && minute <= 60 && second >= 0 && second <= 60;
    }

    public void timeChanges(int hour, int minute, int second) {
        increaseSeconds(second);
        increaseMinutes(minute);
        increaseHours(hour);
    }

    private void increaseSeconds(int second) {
        this.second += second;
        while (this.second >= 60) {
            this.second -= 60;
            this.minute++;
        }
    }

    private void increaseMinutes(int minute) {
        this.minute += minute;
        while (this.minute >= 60) {
            this.minute -= 60;
            this.hour++;
        }
    }

    private void increaseHours(int hour) {
        this.hour += hour;
        while (this.hour >= 24) {
            this.hour -= 24;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute && second == time.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
