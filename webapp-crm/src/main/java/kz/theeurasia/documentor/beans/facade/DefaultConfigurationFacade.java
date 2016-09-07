package kz.theeurasia.documentor.beans.facade;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import kz.theeurasia.documentor.api.facade.ConfigurationFacade;

@Named("configurationFacade")
@ApplicationScoped
public class DefaultConfigurationFacade implements ConfigurationFacade {

    private static final boolean DEBUG = false;
    private static final int THUMBNAIL_WIDTH = 150;
    private static final int THUMBNAIL_HEIGHT = 150;

    @Override
    public boolean isDebug() {
	return DEBUG;
    }

    @Override
    public int getThumbnailWidth() {
	return THUMBNAIL_WIDTH;
    }

    @Override
    public int getThumbnailHeight() {
	return THUMBNAIL_HEIGHT;
    }
}
