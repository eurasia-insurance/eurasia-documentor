package kz.theeurasia.documentor.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-06T18:40:55.431+0600")
@StaticMetamodel(UploadedFile.class)
public class UploadedFile_ extends GenericEntity_ {
	public static volatile SingularAttribute<UploadedFile, String> name;
	public static volatile SingularAttribute<UploadedFile, String> mimeType;
	public static volatile SingularAttribute<UploadedFile, FileType> type;
	public static volatile SingularAttribute<UploadedFile, byte[]> content;
	public static volatile SingularAttribute<UploadedFile, DocumentPackage> documentPackage;
}
