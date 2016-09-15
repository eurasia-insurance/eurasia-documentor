package kz.theeurasia.documentor.beans.holder.pojo;

import javax.validation.constraints.NotNull;

import kz.theeurasia.documentor.api.dao.SearchParameters;

public class DefaultSearchParameters implements SearchParameters {

    @NotNull(message = "{kz.theeurasia.documentor.beans.holder.pojo.DefaultSearchParameters.idNumberPattern.NotNull.message}")
    private String idNumberPattern;

    private String fileNamePattern;

    public void setIdNumberPattern(String idNumberPattern) {
	this.idNumberPattern = idNumberPattern;
    }

    @Override
    public String getIdNumberPattern() {
	return idNumberPattern;
    }

    @Override
    public String getFileNamePattern() {
	return fileNamePattern;
    }

    public void setFileNamePattern(String fileNamePattern) {
	this.fileNamePattern = fileNamePattern;
    }
}
