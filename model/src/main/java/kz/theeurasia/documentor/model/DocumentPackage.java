package kz.theeurasia.documentor.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.lapsa.kz.idnumber.validators.ValidIdNumber;

public class DocumentPackage extends GenericEntity<Integer> {

    @NotNull(message = "{kz.theeurasia.documentor.model.DocumentPackage.idNumber.NotNull.message}")
    @ValidIdNumber
    private String idNumber;

    @NotNull
    private Date created;

    private List<UploadedFile> uploadedFiles;

    private static final int PRIME = 17;
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

    public String getIdNumber() {
	return idNumber;
    }

    public void setIdNumber(String idNumber) {
	this.idNumber = idNumber;
    }

    public Date getCreated() {
	return created;
    }

    public void setCreated(Date created) {
	this.created = created;
    }

    public List<UploadedFile> getUploadedFiles() {
	return uploadedFiles;
    }

    public void setUploadedFiles(List<UploadedFile> uploadedFiles) {
	this.uploadedFiles = uploadedFiles;
    }
}
