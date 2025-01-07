package example;

public class ImplMethod extends CalculateMethods {
    @Override
    public double average(long sum, long count) {
        return (double) sum / count;
    }
}
