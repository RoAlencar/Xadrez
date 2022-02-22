package br.com.raxInformatica.xadrez;

import br.com.raxInformatica.xadrez.chess.ChessMatch;
import br.com.raxInformatica.xadrez.chess.ChessPiece;
import br.com.raxInformatica.xadrez.chess.pieces.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println("\nSource: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println("\nTarget: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);


        }
    }
}
