public enum Days {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    //the days are diff obj all under days
    //enums used when there are constants, small and simple
    //can techically have variables (daynum)
    //used for few simple, unchanging objects

    int daynum;

    Days(int daynum){
        this.daynum = daynum;
    }
}
