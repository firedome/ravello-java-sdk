package com.firedome.ravello.exception;

/**
 * Exception thrown by Ravello
 */
public class RavelloException extends RuntimeException {

    /**
     * <p>
     * HTTP status
     * </p>
     */
    private int status;

    /**
     * <p>
     * Ravello error code
     * </p>
     */
    private Object errorCode;

    /**
     * <p>
     * Ravello error message
     * </p>
     */
    private Object errorMessage;

    /**
     * Constructs a new RavelloException with the specified status and error message.
     * @param status
     * @param errorMessage
     */
    public RavelloException(int status, Object errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    /**
     * Constructs a new RavelloException with the specified status, error code and error message.
     * @param status
     * @param errorCode
     * @param errorMessage
     */
    public RavelloException(int status, Object errorCode, Object errorMessage) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getStatus() {
        return status;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }
}
