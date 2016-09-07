package kz.theeurasia.documentor.model;

public class UploadedFile extends GenericEntity<Integer> {

    private String name;

    private String mimeType;

    private FileType type;

    private byte[] content;

    private DocumentPackage documentPackage;

    private static final int PRIME = 37;
    private static final int MULTIPLIER = PRIME;

    @Override
    protected int getPrime() {
	return PRIME;
    }

    @Override
    protected int getMultiplier() {
	return MULTIPLIER;
    }

    // GENERATED

    public DocumentPackage getDocumentPackage() {
	return documentPackage;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getMimeType() {
	return mimeType;
    }

    public void setMimeType(String mimeType) {
	this.mimeType = mimeType;
    }

    public FileType getType() {
	return type;
    }

    public void setType(FileType type) {
	this.type = type;
    }

    public void setDocumentPackage(DocumentPackage documentPackage) {
	this.documentPackage = documentPackage;
    }

    public byte[] getContent() {
	return content;
    }

    public void setContent(byte[] content) {
	this.content = content;
    }

}
