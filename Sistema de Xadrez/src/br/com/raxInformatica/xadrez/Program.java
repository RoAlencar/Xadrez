package br.com.raxInformatica.xadrez;

import br.com.raxInformatica.xadrez.chess.ChessMatch;
import br.com.raxInformatica.xadrez.chess.ChessPiece;
import br.com.raxInformatica.xadrez.chess.exception.ChessException;
import br.com.raxInformatica.xadrez.chess.pieces.ChessPosition;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }



    }
}

