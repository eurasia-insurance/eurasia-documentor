package kz.theeurasia.documentor.model.listeners;

import java.util.Date;

import kz.theeurasia.documentor.model.DocumentPackage;

public class DocumentPackageListener {

    public void prePersist(DocumentPackage entity) {
	if (entity.getCreated() == null)
	    entity.setCreated(new Date());
    }
}
