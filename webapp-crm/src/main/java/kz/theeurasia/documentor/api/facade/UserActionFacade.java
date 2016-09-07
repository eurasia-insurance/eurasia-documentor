package kz.theeurasia.documentor.api.facade;

import javax.faces.event.AjaxBehaviorEvent;

public interface UserActionFacade extends ActionFacade {
    Outcome doResetFilter();

    void onFilterChanged(AjaxBehaviorEvent event);

}
