package day17;

public class ChessBoard {
    private ChessPiece[][] chessPiece;
    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPiece = chessPieces;
    }
    public void print(){
        for (int i = 0; i < chessPiece.length; i++) {
            for (int j = 0; j < chessPiece.length; j++) {
                System.out.print(chessPiece[i][j].getDesignation());
            }
            System.out.println();
        }
    }
}
