package kz.theeurasia.documentor.api.facade;

public enum Outcome {
    HOME("home"), //
    SUCCESS("success"),
    //
    ;

    private final String code;

    private Outcome(String code) {
	this.code = code;
    }

    @Override
    public String toString() {
	return code;
    }

    public String getCode() {
	return code;
    }
}
