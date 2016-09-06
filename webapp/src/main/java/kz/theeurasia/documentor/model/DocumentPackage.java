package kz.theeurasia.documentor.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lapsa.insurance.validation.NotNullValue;
import com.lapsa.kz.idnumber.validators.ValidIdNumber;

@Entity
@Table(name = "DOCUMENT_PACKAGE")
public class DocumentPackage extends GenericEntity<Integer> {

    @Basic
    @Column(name = "IDNUMBER")
    @NotNullValue
    @ValidIdNumber
    private String idNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "documentPackage")
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
