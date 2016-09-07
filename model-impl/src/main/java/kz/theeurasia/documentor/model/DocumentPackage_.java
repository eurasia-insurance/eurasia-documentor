package kz.theeurasia.documentor.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-02T12:40:17.501+0600")
@StaticMetamodel(DocumentPackage.class)
public class DocumentPackage_ extends GenericEntity_ {
	public static volatile SingularAttribute<DocumentPackage, String> idNumber;
	public static volatile ListAttribute<DocumentPackage, UploadedFile> uploadedFiles;
}
