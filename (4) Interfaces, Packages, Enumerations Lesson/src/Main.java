public class Main {
    public static void main(String[] args) {
        Days day = Days.SUNDAY;

        switch (day){
            case FRIDAY:
                System.out.println(day.daynum);
                break;
            case SUNDAY:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not fri or sun");
                break;
        }

        //------------------------------------------------------
        Increment increment = new Increment();
        System.out.println(increment.value);
        increment.getNext();
        System.out.println(increment.value);
    }
}
