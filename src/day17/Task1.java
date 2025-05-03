package src.day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieсes = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
        };

        for (ChessPiece chessPiece : pieсes)
            System.out.print(chessPiece.getName() + " ");

    }
}
