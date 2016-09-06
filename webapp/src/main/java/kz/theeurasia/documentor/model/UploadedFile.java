package kz.theeurasia.documentor.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UPLOADED_FILE")
public class UploadedFile extends GenericEntity<Integer> {

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "MIME_TYPE")
    private String mimeType;

    @Basic
    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private FileType type;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "CONTENT")
    @Lob
    private byte[] content;

    @ManyToOne
    @JoinColumn(name = "DOCUMENT_PACKAGE_ID")
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
