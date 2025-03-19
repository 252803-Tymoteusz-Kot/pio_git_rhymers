package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    final int DWANASCIE = 12;
    final int JEDENASCIE = 11;
    final int MINUSJEDEN = -1;

    private int[] numbers = new int[DWANASCIE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUSJEDEN;
    }

    public boolean isFull() {
        return total == JEDENASCIE;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUSJEDEN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUSJEDEN;
        return numbers[total--];
    }

}
