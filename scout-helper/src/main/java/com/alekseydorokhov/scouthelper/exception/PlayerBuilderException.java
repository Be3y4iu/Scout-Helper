package com.alekseydorokhov.scouthelper.exception;

public class PlayerBuilderException extends RuntimeException {
    public PlayerBuilderException() {
        super();
    }

    public PlayerBuilderException(String message) {
        super(message);
    }

    public PlayerBuilderException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerBuilderException(Throwable cause) {
        super(cause);
    }
}
