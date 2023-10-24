package day17;

import day14.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> figures = new ArrayList<>();

        ChessPiece pawn1 = ChessPiece.PAWN_WHITE;
        ChessPiece pawn2 = ChessPiece.PAWN_WHITE;
        ChessPiece pawn3 = ChessPiece.PAWN_WHITE;
        ChessPiece pawn4 = ChessPiece.PAWN_WHITE;


        figures.add(pawn1);
        figures.add(pawn2);
        figures.add(pawn3);
        figures.add(pawn4);

        ChessPiece rook1 = ChessPiece.ROOK_BLACK;
        ChessPiece rook2 = ChessPiece.ROOK_BLACK;
        ChessPiece rook3 = ChessPiece.ROOK_BLACK;
        ChessPiece rook4 = ChessPiece.ROOK_BLACK;

        figures.add(rook1);
        figures.add(rook2);
        figures.add(rook3);
        figures.add(rook4);

        for(ChessPiece piece: figures) {
            System.out.print(piece.getDesignation());
        }
    }
}