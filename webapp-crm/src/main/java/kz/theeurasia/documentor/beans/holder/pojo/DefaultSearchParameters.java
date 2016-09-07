package kz.theeurasia.documentor.beans.holder.pojo;

import com.lapsa.insurance.validation.NotNullValue;

import kz.theeurasia.documentor.api.dao.SearchParameters;

public class DefaultSearchParameters implements SearchParameters {

    @NotNullValue
    private String idNumberPattern;

    public void setIdNumberPattern(String idNumberPattern) {
	this.idNumberPattern = idNumberPattern;
    }

    @Override
    public String getIdNumberPattern() {
	return idNumberPattern;
    }

}
