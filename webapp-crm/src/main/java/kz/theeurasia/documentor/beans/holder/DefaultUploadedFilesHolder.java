package kz.theeurasia.documentor.beans.holder;

import java.util.List;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import kz.theeurasia.documentor.api.holder.UploadedFilesHolder;
import kz.theeurasia.documentor.model.UploadedFile;

@Named("uploadedFiles")
@ViewScoped
public class DefaultUploadedFilesHolder extends DefaultValueHolder<List<UploadedFile>>
	implements UploadedFilesHolder {
    private static final long serialVersionUID = 3031103590118664245L;

    @Override
    public void reset() {
	value = null;
    }

}
