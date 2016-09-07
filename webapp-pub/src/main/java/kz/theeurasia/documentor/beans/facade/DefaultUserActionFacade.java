package kz.theeurasia.documentor.beans.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;

import kz.theeurasia.documentor.api.dao.DAOException;
import kz.theeurasia.documentor.api.dao.DocumentPackageDAO;
import kz.theeurasia.documentor.api.facade.FacesMessagesFacade;
import kz.theeurasia.documentor.api.facade.Outcome;
import kz.theeurasia.documentor.api.facade.UIMessages;
import kz.theeurasia.documentor.api.facade.UserActionFacade;
import kz.theeurasia.documentor.api.holder.DocumentPackageHolder;
import kz.theeurasia.documentor.model.DocumentPackage;
import kz.theeurasia.documentor.model.FileType;
import kz.theeurasia.documentor.model.UploadedFile;

@Named("userActionFacade")
@ApplicationScoped
public class DefaultUserActionFacade implements UserActionFacade {

    @Inject
    protected Logger logger;

    @Inject
    private DocumentPackageHolder documentPackageHolder;

    @Inject
    private FacesMessagesFacade fffacade;

    @Inject
    private DocumentPackageDAO dao;

    @Override
    public Outcome doInitialize() {
	return null;
    }

    @Override
    public Outcome doComplete() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Outcome doDeleteFile(UploadedFile file) {
	DocumentPackage pack = documentPackageHolder.getValue();
	pack.getUploadedFiles().remove(file);
	return null;
    }

    @Override
    public void onFileUpload(FileUploadEvent event) {
	attachFile(event);
    }

    @Override
    public Outcome doSend() {
	savePackage();
	resetSession();
	return Outcome.SUCCESS;
    }

    // PRIVATE

    private void attachFile(FileUploadEvent event) {
	DocumentPackage pack = documentPackageHolder.getValue();

	UploadedFile file = new UploadedFile();
	file.setName(event.getFile().getFileName());
	file.setMimeType(event.getFile().getContentType());
	file.setType(FileType.forMimeType(event.getFile().getContentType()));
	file.setContent(event.getFile().getContents());

	// add

	file.setDocumentPackage(pack);
	pack.getUploadedFiles().add(file);
    }

    private void resetSession() {
	FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    private void savePackage() {
	try {
	    documentPackageHolder.setValue(dao.save(documentPackageHolder.getValue()));
	} catch (DAOException e) {
	    fffacade.addMessage(UIMessages.ERROR_INTERNAL_SERVER_ERROR, FacesMessage.SEVERITY_ERROR);
	    logger.log(Level.SEVERE, "Error while saving DocumentPackage", e);
	    throw new RuntimeException(e);
	}
    }

}
