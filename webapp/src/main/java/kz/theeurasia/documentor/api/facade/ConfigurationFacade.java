package kz.theeurasia.documentor.api.facade;

public interface ConfigurationFacade {

    String getAcceptTypes();

    int getFileCountLimit();

    int getFileSizeLimit();
    
    boolean isDebug();

    int getThumnailWidth();

    int getThumnailHeight();

}
