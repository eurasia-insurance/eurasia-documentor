package kz.theeurasia.documentor.api.facade;

public enum UIMessages {

    // global names
    NAME_COMPANY_SHORT("name.company-short"),
    NAME_COMPANY_FULL("name.company-full"),
    NAME_SITE("name.site"),

    // commands
    COMMAND_GO_PREVIOUS_SCREEN("command.go-previous-screen"),
    COMMAND_POLICY_ADD_DRIVER("command.policy.add-driver"),
    COMMAND_POLICY_REMOVE_DRIVER("command.policy.remove-driver"),
    COMMAND_POLICY_ADD_VEHICLE("command.policy.add-vehicle"),
    COMMAND_POLICY_REMOVE_VEHICLE("command.policy.remove-vehicle"),
    COMMAND_POLICY_CALCULATE_COST("command.policy.calculate-cost"),
    COMMAND_CASCO_CALCULATE_COST("command.casco.calculate-cost"),
    COMMAND_GO_CASCO_REQUEST("command.go-casco-request"),
    COMMAND_GO_SCREEN_POLICY_REQUEST("command.go-policy-request"),
    COMMAND_GO_SCREEN_OBTAINING("command.go-screen-obtaining"),
    COMMAND_GO_SCREEN_PAYMENT("command.go-screen-payment"),
    COMMAND_GO_SCREEN_FINAL("command.go-screen-final"),
    COMMAND_GO_HOME_PAGE("command.go-home-page"),
    COMMAND_GO_KKB_PAYMENT("command.go-kkb-payment"),
    COMMAND_UPLOAD_TWO_SIDED_DOCUMENT_FRONTSIDE("command.upload-two-sided-document-frontside"),
    COMMAND_UPLOAD_TWO_SIDED_DOCUMENT_BACKSIDE("command.upload-two-sided-document-backside"),

    // labels
    LABEL_POLICY_ID_NUMBER("label.policy.id-number"),
    LABEL_POLICY_VEHICLE_AREA("label.policy.vehicle-area"),
    LABEL_POLICY_VEHICLE_CITY("label.policy.vehicle-city"),
    LABEL_POLICY_INSURANCE_CLASS_TYPE("label.policy.insurance-class-type"),
    LABEL_POLICY_AGE_CLASS("label.policy.age-class"),
    LABEL_POLICY_DRIVER_EXPIRIENCE_CLASS("label.policy.driver-expirience-class"),
    LABEL_POLICY_DRIVER_HAS_PRIVILEGE("label.policy.driver-has-privilege"),
    LABEL_POLICY_VEHICLE_AGE_CLASS("label.policy.vehicle-age-class"),
    LABEL_POLICY_VEHICLE_CLASS("label.policy.vehicle-class"),

    LABEL_CASCO_COVER_ROAD_ACCIDENTS("label.casco.cover-road-accidents"),
    LABEL_CASCO_COVER_NON_ROAD_ACCIDENTS("label.casco.cover-non-road-accidents"),
    LABEL_CASCO_VEHICLE_COST("label.casco.vehicle-cost"),
    LABEL_CASCO_VEHICLE_YOM("label.casco.vehicle-yom"),
    LABEL_CASCO_VEHICLE_AREA("label.casco.vehicle-area"),
    LABEL_CASCO_VEHICLE_CITY("label.casco.vehicle-city"),
    LABEL_CASCO_DEDUCTIBLE_PARTIAL_REQUIRED("label.casco.deductilbe-partial-required"),
    LABEL_CASCO_NO_GUILT_NO_DEDUCTIBLE_REQUIRED("label.casco.no-guilt-no-deductible-required"),
    LABEL_CASCO_DEDUCTIBLE_FULL_RATE("label.casco.deductilbe-full-rate"),
    LABEL_CASCO_OPTIONS("label.casco.options"),
    LABEL_CASCO_NO_POLICE_CALL_REQUIRED("label.casco.no-police-call-required"),
    LABEL_CASCO_HELP_WITH_POLICE_REQUIRED("label.casco.help-with-police-required"),
    LABEL_CASCO_SPECIAL_SERVICE_STATION_REQUIRED("label.casco.special-service-station-required"),
    LABEL_CASCO_EVACUATOR_REQUIRED("label.casco.evacuator-required"),
    LABEL_CASCO_REPLACEMENT_CAR_REQUIRED("label.casco.replacement-car-required"),
    LABEL_CASCO_CONTRACT_ENDS_AFTER_FIRST_CASE("label.casco.contract-ends-after-first-case"),
    LABEL_CASCO_ADITIONAL_OPTIONS("label.casco.aditional-options"),
    LABEL_CASCO_THIRD_PARTY_LIABILITY_COVERAGE("label.casco.third-party-liability-coverage"),
    LABEL_CASCO_DRIVER_AND_PASSENGER_COVERAGE("label.casco.driver-and-passenger-coverage"),
    LABEL_CASCO_DRIVER_AND_PASSENGER_COUNT("label.casco.driver-and-passenger-count"),

    LABEL_REQUEST_REQUESTER_NAME("label.request.requester-name"),
    LABEL_REQUEST_REQUESTER_PHONE("label.request.requester-phone"),
    LABEL_REQUEST_REQUESTER_EMAIL("label.request.requester-email"),
    LABEL_REQUEST_SPAM_AGREE("label.request.spam-agree"),
    LABEL_REQUEST_ALLOW_PROCESS_PERSONAL_DATA("label.request.allow-process-personal-data"),
    LABEL_REQUEST_OBTAINING_METHOD("label.request.obtaining-method"),
    LABEL_REQUEST_DELIVERY_DATE("label.request.delivery-date"),
    LABEL_REQUEST_DELIVERY_TIME("label.request.delivery-time"),
    LABEL_REQUEST_DELIVERY_CITY("label.request.delivery-city"),
    LABEL_REQUEST_DELIVERY_ADDRESS("label.request.delivery-address"),
    LABEL_REQUEST_PICKUP_CITY("label.request.pickup-city"),
    LABEL_REQUEST_PICKUP_POINT_OF_SALE("label.request.pickup-point-of-sale"),

    LABEL_IDENTITY_CARD_SCAN("label.identity-card-scan"),
    LABEL_DRIVER_LICENSE_SCAN("label.driver-license-scan"),
    LABEL_VEHICLE_CERTIFICATE_SCAN("label.vehicle-certificate-scan"),

    // placeholders
    PLACEHOLDER_POLICY_ID_NUMBER("placeholder.policy.id-number"),
    PLACEHOLDER_CASCO_VEHICLE_COST("placeholder.casco.vehicle-cost"),
    PLACEHOLDER_CASCO_VEHICLE_YOM("placeholder.casco.vehicle-yom"),
    PLACEHOLDER_CASCO_DRIVER_AND_PASSENGER_COUNT("placeholder.casco.driver-and-passenger-count"),
    PLACEHOLDER_POLICY_INSURANCE_CLASS("placeholder.policy.insurance-class"),
    PLACEHOLDER_REQUEST_REQUESTER_NAME("placeholder.request.requester-name"),
    PLACEHOLDER_REQUEST_REQUESTER_PHONE("placeholder.request.requester-phone"),
    PLACEHOLDER_REQUEST_REQUESTER_EMAIL("placeholder.request.requester-email"),
    PLACEHOLDER_REQUEST_DELIVERY_DATE("placeholder.request.delivery-date"),
    PLACEHOLDER_REQUEST_DELIVERY_ADDRESS("placeholder.request.delivery-address"),

    // select items
    SI_UNSPECIFIED("si.UNSPECIFIED"),

    // titles
    TITLE_POLICY_CALCULATION_SCREEN("title.policy.calculation-screen"),
    TITLE_POLICY_REQUEST_SCREEN("title.policy.request-screen"),
    TITLE_POLICY_OBTAINING_SCREEN("title.policy.obtaining-screen"),
    TITLE_CASCO_CALCULATION_SCREEN("title.casco.calculation-screen"),
    TITLE_CASCO_REQUEST_SCREEN("title.casco.request-screen"),
    TITLE_CASCO_OBTAINING_SCREEN("title.casco.obtaining-screen"),
    TITLE_PAYMENT_SCREEN("title.payment-screen"),
    TITLE_FINAL_SCREEN("title.final-screen"),

    // texts
    TEXT_WAIT("text.wait"),
    TEXT_OOPS("text.oops"),
    TEXT_POLICY_COST("text.policy-cost"),
    TEXT_CASCO_COST("text.casco-cost"),
    TEXT_POLICY_REQUEST_SCAN_NOTE("text.policy-request.scan-note"),
    TEXT_DRIVER_INFO_NUMBER_1("text.driver-info.number.1"),
    TEXT_DRIVER_INFO_NUMBER_2("text.driver-info.number.2"),
    TEXT_DRIVER_INFO_NUMBER_3("text.driver-info.number.3"),
    TEXT_DRIVER_INFO_NUMBER_4("text.driver-info.number.4"),
    TEXT_DRIVER_INFO_NUMBER_5("text.driver-info.number.5"),
    TEXT_DRIVER_INFO_NUMBER_6("text.driver-info.number.6"),
    TEXT_DRIVER_INFO_NUMBER_7("text.driver-info.number.7"),
    TEXT_DRIVER_INFO_NUMBER_8("text.driver-info.number.8"),
    TEXT_DRIVER_INFO_NUMBER_9("text.driver-info.number.9"),
    TEXT_DRIVER_INFO_NUMBER_10("text.driver-info.number.10"),
    TEXT_VEHICLE_INFO_NUMBER_1("text.vehicle-info.number.1"),
    TEXT_VEHICLE_INFO_NUMBER_2("text.vehicle-info.number.2"),
    TEXT_VEHICLE_INFO_NUMBER_3("text.vehicle-info.number.3"),
    TEXT_VEHICLE_INFO_NUMBER_4("text.vehicle-info.number.4"),
    TEXT_VEHICLE_INFO_NUMBER_5("text.vehicle-info.number.5"),
    TEXT_VEHICLE_INFO_NUMBER_6("text.vehicle-info.number.6"),
    TEXT_VEHICLE_INFO_NUMBER_7("text.vehicle-info.number.7"),
    TEXT_VEHICLE_INFO_NUMBER_8("text.vehicle-info.number.8"),
    TEXT_VEHICLE_INFO_NUMBER_9("text.vehicle-info.number.9"),
    TEXT_VEHICLE_INFO_NUMBER_10("text.vehicle-info.number.10"),
    TEXT_TWO_SIDED_DOCUMENT_WARNING("text.two-sided-document-warning"),
    TEXT_OBTAINING_DELIVERY_DATE_INFO("text.obtaining-delivery-date-info"),
    TEXT_OBTAINING_DELIVERY_COST_INFO("text.obtaining-delivery-cost-info"),

    // errors
    ERROR_INTERNAL_SERVER_ERROR("error.internal-server-error"),
    ERROR_HTTP_ERROR_500("error.http-error-500"),
    ERROR_HTTP_ERROR_404("error.http-error-404"),
    ERROR_HTTP_ERROR_EXPIRED("error.http-error-expired"),
    ERROR_MUST_COMPLETE_CALCULATION("error.must-complete-calculation"),
    ERROR_EMPTY_DRIVER_LIST("error.empty-driver-list"),
    ERROR_ONE_DRIVER_ALLOWED("error.one-driver-allowed"),
    ERROR_MAXIMUM_DRIVERS_COUNT_REACHED("error.maximum-drivers-count-reached"),
    ERROR_DRIVER_IDNUMBER_MUST_UNIQUE("error.driver-id-number-must-unique"),
    ERROR_EMPTY_VEHICLE_LIST("error.empty-vehicle-list"),
    ERROR_ONE_VEHICLE_ALLOWED("error.one-vehicle-allowed"),
    ERROR_MAXIMUM_VEHICLES_COUNT_REACHED("error.maximum-vehicles-count-reached"),
    ERROR_CALCULATION_EXCEPTION("error.calculation-exception"),
    ERROR_INVALID_UPLOADED_IMAGE("error.invalid-uploaded-image"),
    ERROR_MAXIMUM_UPLOADED_IMAGE_SIZE("error.maximum-uploaded-image-size"),
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
