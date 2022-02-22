package br.com.raxInformatica.xadrez.chess;

import br.com.raxInformatica.xadrez.boardgame.Board;
import br.com.raxInformatica.xadrez.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
