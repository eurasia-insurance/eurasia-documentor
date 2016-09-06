package kz.theeurasia.documentor.producers;

import java.util.ResourceBundle;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;

import kz.theeurasia.documentor.api.facade.UIMessages;

@RequestScoped
public class UIMessagesResourceBundleProducer {

    @Produces
    public ResourceBundle getUIMessages(InjectionPoint injectionPoint) {
	FacesContext context = FacesContext.getCurrentInstance();
	return context.getApplication().getResourceBundle(context, UIMessages.BUNDLE_VAR);
    }
}
