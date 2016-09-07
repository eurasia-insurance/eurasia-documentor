package kz.theeurasia.documentor.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-07T15:05:16.193+0600")
@StaticMetamodel(DocumentPackage.class)
public class DocumentPackage_ extends GenericEntity_ {
	public static volatile SingularAttribute<DocumentPackage, String> idNumber;
	public static volatile SingularAttribute<DocumentPackage, Date> created;
	public static volatile ListAttribute<DocumentPackage, UploadedFile> uploadedFiles;
}
