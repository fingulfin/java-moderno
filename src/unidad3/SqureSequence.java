package unidad3;

public class SqureSequence implements  IntSequence {
private int i;
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        i++;
        return i*i;
    }
}
