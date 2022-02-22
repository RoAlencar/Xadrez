package br.com.raxInformatica.xadrez.chess.exception;

import br.com.raxInformatica.xadrez.boardgame.exception.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 4351226961185358805L;

    public ChessException(String msg){
        super(msg);
    }

}


