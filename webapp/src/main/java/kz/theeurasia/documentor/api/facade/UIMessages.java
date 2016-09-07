package kz.theeurasia.documentor.api.facade;

public enum UIMessages {

    // global names
    NAME_COMPANY_SHORT("name.company-short"),
    NAME_COMPANY_FULL("name.company-full"),
    NAME_SITE("name.site"),

    // commands
    COMMAND_UPLOAD_CANCEL("command.upload-cancel"),
    COMMAND_UPLOAD_BEGIN("command.upload-begin"),
    COMMAND_UPLOAD_CHOOSE("command.upload-choose"),
    COMMAND_SEND("command.send"),
    COMMAND_GO_HOME_PAGE("command.go-home-page"),

    // labels
    LABEL_ID_NUMBER("label.id-number"),

    // placeholders
    PLACEHOLDER_ID_NUMBER("placeholder.id-number"),

    // texts
    TEXT_WAIT("text.wait"),
    TEXT_OOPS("text.oops"),

    // errors
    ERROR_INTERNAL_SERVER_ERROR("error.internal-server-error"),
    ERROR_HTTP_ERROR_500("error.http-error-500"),
    ERROR_HTTP_ERROR_404("error.http-error-404"),
    ERROR_HTTP_ERROR_EXPIRED("error.http-error-expired"),
    //
    ;

    private final String key;

    public static final String BUNDLE_BASENAME = "UIMessages";
    public static final String BUNDLE_VAR = "ui";

    UIMessages(String key) {
	this.key = key;
    }

    public String getKey() {
	return key;
    }

}
