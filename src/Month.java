public enum Month {
    JANUARY("winter"),
    MARCH("spring"),
    JUNE("summer");

    String season;

    Month(String season) {
        this.season = season;
    }

    public void printSeason(){
        System.out.println(this.season);
    }
}
