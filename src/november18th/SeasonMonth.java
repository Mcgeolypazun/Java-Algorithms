package november18th;

public enum SeasonMonth {
    JANUARY(Season.WINTER, 31),
    FEBRUARY(Season.WINTER, 28),
    MARCH(Season.SPRING, 31),
    APRIL(Season.SPRING, 30),
    MAY(Season.SPRING, 31),
    JUNE(Season.SUMMER, 30),
    JULY(Season.SUMMER, 31),
    AUGUST(Season.SUMMER, 31),
    SEPTEMBER(Season.FALL, 30),
    OCTOBER(Season.FALL, 31),
    NOVEMBER(Season.FALL, 30),
    DECEMBER(Season.WINTER, 31);

    private final Season season;
    private final int days;

    SeasonMonth(Season season, int days) {
        this.season = season;
        this.days = days;
    }

    public Season getSeason() {
        return season;
    }

    public int getDays() {
        return days;
    }
}

