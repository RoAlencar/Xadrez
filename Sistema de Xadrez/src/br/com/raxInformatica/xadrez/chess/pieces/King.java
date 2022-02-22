package br.com.raxInformatica.xadrez.chess.pieces;

import br.com.raxInformatica.xadrez.boardgame.Board;
import br.com.raxInformatica.xadrez.chess.ChessPiece;
import br.com.raxInformatica.xadrez.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
