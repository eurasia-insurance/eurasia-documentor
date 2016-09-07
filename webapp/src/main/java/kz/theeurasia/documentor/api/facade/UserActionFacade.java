package kz.theeurasia.documentor.api.facade;

import org.primefaces.event.FileUploadEvent;

import kz.theeurasia.documentor.model.UploadedFile;

public interface UserActionFacade extends ActionFacade {

    Outcome doComplete();

    Outcome doDeleteFile(UploadedFile file);

    Outcome doSend();
    
    // other
    void onFileUpload(FileUploadEvent event);

}
