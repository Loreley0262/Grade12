public class Increment implements  IncreaseByFactor{
    //use 'implements instead of extends'

    int value = 5;

    @Override
    public void getNext() {
        value += FACTOR;
    }
    @Override
    public void setStart(int x) {
        value = x;
    }


}
