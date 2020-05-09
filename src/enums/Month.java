package enums;

public enum Month {
    JANUARY("winter"),
    MARCH("spring"),
    JUNE("summer");

    public String season;

    Month(String season) {
        this.season = season;
    }

    public void printSeason(){
        System.out.println(this.season);
    }
}
