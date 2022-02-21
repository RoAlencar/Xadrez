package br.com.raxInformatica.xadrez.boardgame.exception;

public class BoardException extends RuntimeException {
    private static final long serialVersionUID = -7963059282112936482L;

    public BoardException(String msg){
        super(msg);
    }
}
