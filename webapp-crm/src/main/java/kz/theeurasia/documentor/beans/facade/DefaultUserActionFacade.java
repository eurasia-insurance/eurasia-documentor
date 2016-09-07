package kz.theeurasia.documentor.beans.facade;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import kz.theeurasia.documentor.api.dao.DAOException;
import kz.theeurasia.documentor.api.dao.SearchParameters;
import kz.theeurasia.documentor.api.dao.UploadedFileDAO;
import kz.theeurasia.documentor.api.facade.Outcome;
import kz.theeurasia.documentor.api.facade.UserActionFacade;
import kz.theeurasia.documentor.api.holder.SearchParametersHolder;
import kz.theeurasia.documentor.api.holder.UploadedFilesHolder;
import kz.theeurasia.documentor.model.UploadedFile;

@Named("userActionFacade")
@ApplicationScoped
public class DefaultUserActionFacade implements UserActionFacade {

    @Override
    public void onFilterChanged(AjaxBehaviorEvent event) {
	refreshRequests();
    }

    @Override
    public Outcome doInitialize() {
	resetParameters();
	return null;
    }

    @Override
    public Outcome doResetFilter() {
	resetParameters();
	refreshRequests();
	return null;
    }

    // PRIVATE

    @Inject
    private SearchParametersHolder searchParametersHolder;

    @Inject
    private UploadedFilesHolder uploadedFilesHolder;

    @Inject
    private UploadedFileDAO uploadedFileDAO;

    private void resetParameters() {
	searchParametersHolder.reset();
    }

    private void refreshRequests() {
	try {
	    SearchParameters params = searchParametersHolder.getValue();
	    List<UploadedFile> res = uploadedFileDAO.findBySerachParameters(params);
	    uploadedFilesHolder.setValue(res);
	} catch (DAOException e) {
	    throw new RuntimeException(e);
	}
    }
}
