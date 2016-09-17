
public class BloppiDate {

    private final int days;

    public BloppiDate(int year, int month, int day) {
        if (month > 11 || month < 0) {
            throw new IllegalArgumentException("Month out of bounds");
        }
        if (day > 29 || day < 0) {
            throw new IllegalArgumentException("Day out of bounds");
        }

        if (year < 0) {
            day = -day;
            month = -month;
        }
        int _days = year * 360 + month * 30 + day;

        this.days = _days;
    }

    public String toString() {
        int year = days / 360;
        int _remain = days % 360;
        int month = _remain / 30;
        int __remain = _remain % 30;
        int day = __remain;
        if (month > 11) {
            year++;
            month = month % 12;
        }
        if (days < 0) {
            month = -month;
            day = -day;
        }
        return day + "/" + month + "/" + year;
    }

    public BloppiDate AddDays(int days) {

        int year = days / 360;
        int _remain = days - (year * 360);
        int month = _remain / 30;
        if (month > 11) {
            month = month % 12;
            year++;
        }
        _remain = _remain - (month * 30);

        int day = _remain;

        if (day > 30) {
            day = day % 30;
            month++;
        }

        return new BloppiDate(year, month, day);
    }

    public int DiffDays(BloppiDate other) {
        return other.days - this.days;
    }
}
