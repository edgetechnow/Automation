package controlStatement;

public class ControlStatement {

    public static void main(String[] args) {
        ControlStatement lesson = new ControlStatement();
        lesson.exploreSunnyWeather();
        lesson.countCodingLoves();
        lesson.playWithNumbers();
        lesson.learnDoWhileLoop();
        lesson.tryWhileDoLoop();
    }

    public void exploreSunnyWeather() {
        boolean isSunny = true;

        if (isSunny) {
            System.out.println("Yay! It's sunny outside!");
        } else {
            System.out.println("Aw, it's not sunny today.");
        }
    }

    public void countCodingLoves() {
        int loveCount = 3;

        for (int i = 0; i < loveCount; i++) {
            System.out.println("I love coding!");
        }
    }

    public void playWithNumbers() {
        int count = 0;

        while (count < 5) {
            System.out.println("Count is: " + count);
            count++;
        }
    }

    public void learnDoWhileLoop() {
        int x = 1;

        do {
            System.out.println("The value of x is: " + x);
            x++;
        } while (x <= 5);
    }

    public void tryWhileDoLoop() {
        int y = 10;

        while (y > 0) {
            System.out.println("The value of y is: " + y);
            y--;
        } do {
            System.out.println("This will be printed at least once!");
        } while (y > 0);
    }
}
