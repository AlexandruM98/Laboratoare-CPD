package Lab1.ProposedExercices.Homework.p4;

public class StringProcessor extends Thread {
    private final String data;
    private final int direction;
    private int index;

    public StringProcessor(String name, String data, int direction, int index) {
        super(name);
        this.data = data;
        this.direction = direction;
        this.index = index;
    }

    @Override
    public void run() {
        if (direction == 1)
            while (index < this.data.length()) {
                System.out.println("Thread " + this.getName() + ":" + this.data.charAt(index++));
            }
        else
            while (index >= 0) {
                System.out.println("Thread " + this.getName() + ":" + this.data.charAt(index--));
            }

    }
}
