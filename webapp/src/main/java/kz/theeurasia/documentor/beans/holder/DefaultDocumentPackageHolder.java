package kz.theeurasia.documentor.beans.holder;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import kz.theeurasia.documentor.api.holder.DocumentPackageHolder;
import kz.theeurasia.documentor.model.DocumentPackage;

@Named("documentPackage")
@SessionScoped
public class DefaultDocumentPackageHolder extends DefaultValueHolder<DocumentPackage> implements DocumentPackageHolder {
    private static final long serialVersionUID = -7790712577840765622L;

    @PostConstruct
    public void init() {
	value = new DocumentPackage();
	value.setUploadedFiles(new ArrayList<>());
    }

}
