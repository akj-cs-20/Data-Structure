package basic;

public class SimpleIntrest {
    public static void main(String[] args) {
        int principle = 200000, time = 2, rate = 36;
        int simpleIntrest = (principle * rate * time) / 100;
        System.out.println(simpleIntrest);
    }
}
