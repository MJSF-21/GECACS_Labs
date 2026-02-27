import java.util.Random;

// Thread to calculate square
class Square extends Thread {
    private int x;

    public Square(int n) {
        this.x = n;
    }

    @Override
    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr);
    }
}

// Thread to calculate cube
class Cube extends Thread {
    private int x;

    public Cube(int n) {
        this.x = n;
    }

    @Override
    public void run() {
        int cb = x * x * x;
        System.out.println("Cube of " + x + " = " + cb);
    }
}

// Thread to generate random numbers
class Number extends Thread {

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            int randomInteger = random.nextInt(100);
            System.out.println("Random number generated: " + randomInteger);

            if (randomInteger % 2 == 0) {
                Square s = new Square(randomInteger);
                s.start();
            } else {
                Cube c = new Cube(randomInteger);
                c.start();
            }

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class Practical7{
    public static void main(String[] args) {
        Number n = new Number();
        n.start();
    }
}