package kz.theeurasia.documentor.api.facade;

import javax.faces.component.UIInput;

public interface ComponentFacade {
    String messagesFor(UIInput component);

    String validationErrorsFor(UIInput component);
}
