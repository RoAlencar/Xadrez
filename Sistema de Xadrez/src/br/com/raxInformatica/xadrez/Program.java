package br.com.raxInformatica.xadrez;

import br.com.raxInformatica.xadrez.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
