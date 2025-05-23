package src.day17;

public enum ChessPiece {
    KING_WHITE("♔", 100), QUEEN_WHITE("♕", 9),
    ROOK_WHITE("♖", 5), BITSHOP_WHITE("♗", 3.5),
    KNIGHT_WHITE("♘", 3), PAWN_WHITE("♙", 1),

    KING_BLACK("♚", 100), QUEEN_BLACK("♛", 9),
    ROOK_BLACK("♜", 5), BITSHOP_BLACK("♝", 3.5),
    KNIGHT_BLACK("♞", 3), PAWN_BLACK("♟", 1),

    EMPTY("_", -1);

    private String name;
    private double value;

    ChessPiece(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
}
