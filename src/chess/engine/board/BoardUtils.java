package chess.engine.board;

public class BoardUtils {
    private BoardUtils() {
        throw new RuntimeException("can't instantiate utility class");
    }

    public static boolean isValidTileCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }
}
