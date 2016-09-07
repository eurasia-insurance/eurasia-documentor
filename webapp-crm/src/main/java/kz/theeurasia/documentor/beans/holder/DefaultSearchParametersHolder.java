package kz.theeurasia.documentor.beans.holder;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import kz.theeurasia.documentor.api.dao.SearchParameters;
import kz.theeurasia.documentor.api.holder.SearchParametersHolder;
import kz.theeurasia.documentor.beans.holder.pojo.DefaultSearchParameters;

@Named("searchParameters")
@ViewScoped
public class DefaultSearchParametersHolder extends DefaultValueHolder<SearchParameters>
	implements SearchParametersHolder {
    private static final long serialVersionUID = -4435358169479717443L;

    @Override
    public void reset() {
	value = new DefaultSearchParameters();
    }

}
