package kz.theeurasia.documentor.api.dao;

public class EntityNotFound extends Exception {
    private static final long serialVersionUID = 3616305339952237291L;

    public EntityNotFound() {
	super();
    }

    public EntityNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    public EntityNotFound(String message, Throwable cause) {
	super(message, cause);
    }

    public EntityNotFound(String message) {
	super(message);
    }

    public EntityNotFound(Throwable cause) {
	super(cause);
    }

}
