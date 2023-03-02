import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min = 0;
    int max = 0;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new Iterator();
    }

    private class Iterator implements java.util.Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int diff = max - min;
            int result = min + random.nextInt(diff + 1);
            return result;
        }
    }
}