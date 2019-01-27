// Branch DARTS_INITIAL
public class Darts {
    enum Multyplier {
        DOUBLE, TRIPLE
    }

    int score = 301;
    int dartsLeft = 3;
    boolean isFinished = false;
    int turn = 1;
    int lastTurnScore = score;

    public int score() { //geter ->normal aparea un get in fata dar e acelasi lucru
        return score;
    }

    public int dartsLeft() {//geter ->normal aparea un get in fata dar e acelasi lucru
        return dartsLeft;
    }

    public boolean isFinished() {//geter ->normal aparea un get in fata dar e acelasi lucru
        return isFinished;
    }

    public int turn() {//geter ->normal aparea un get in fata dar e acelasi lucru
        return turn;
    }

    public void darts(int throwScore) {
        updateDartBoard(throwScore, null);
    }

}
