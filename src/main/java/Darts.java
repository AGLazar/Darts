// branch DARTS_FINAL
public class Darts {
    enum Multyplier {
        DOUBLE, TRIPLE
    }

    int score = 301;
    int dartsLeft = 3;
    boolean isFinished = false;
    int turn = 1;
    int lastTurnScore = score;

    public void darts(int i) {
        int scoreTemp = i;
        updateDartBoard(scoreTemp, null);
    }

    public void darts(int i, Multiplier m) {
        int multiplicator, scoreTemp;
        switch (m) {
            case DOUBLE:
                multiplicator = 2;
                break;
            case TRIPLE:
                multiplicator = 3;
                break;
            default:
                multiplicator = 1;
                break;
        }
        scoreTemp = multiplicator * i;
        updateDartBoard(scoreTemp, m);
    }

    private void updateDartBoard(int scoreTemp, Multiplier m) {
        if (dartsLeft == 1) {
            turn++;
            dartsLeft = 3;
        } else {
            dartsLeft--;
        }
        int throwScore = score - scoreTemp;
        if (throwScore == 0 && m == Multiplier.DOUBLE) {
            isFinished = true;
            score = throwScore;
            return;
        }
        if (throwScore <= 1) {
            throwScore = lastTurnScore;
        }
        if (throwScore > 1 && dartsLeft == 3) {
            lastTurnScore = throwScore;
        }
        score = throwScore;
    }
}
