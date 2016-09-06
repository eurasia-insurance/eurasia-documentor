package kz.theeurasia.documentor.api.facade;

import org.primefaces.event.FileUploadEvent;

import kz.theeurasia.documentor.model.UploadedFile;

public interface UserActionFacade extends ActionFacade {

    String doComplete();

    String doDeleteFile(UploadedFile file);

    // other
    void onFileUpload(FileUploadEvent event);

}
