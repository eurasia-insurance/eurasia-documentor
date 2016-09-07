package kz.theeurasia.documentor.model;

import java.util.List;

import com.lapsa.insurance.validation.NotNullValue;
import com.lapsa.kz.idnumber.validators.ValidIdNumber;

public class DocumentPackage extends GenericEntity<Integer> {

    @NotNullValue
    @ValidIdNumber
    private String idNumber;

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

    public List<UploadedFile> getUploadedFiles() {
	return uploadedFiles;
    }

    public void setUploadedFiles(List<UploadedFile> uploadedFiles) {
	this.uploadedFiles = uploadedFiles;
    }
}
