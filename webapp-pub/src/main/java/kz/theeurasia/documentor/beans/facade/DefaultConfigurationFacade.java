package kz.theeurasia.documentor.beans.facade;

import static kz.theeurasia.documentor.model.FileType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import kz.theeurasia.documentor.api.facade.ConfigurationFacade;
import kz.theeurasia.documentor.model.FileType;

@Named("configurationFacade")
@ApplicationScoped
public class DefaultConfigurationFacade implements ConfigurationFacade {

    public static final FileType[] ACCEPT_TYPES = new FileType[] { GIF, JPEG, PDF, PNG, SVG, TIFF, ZIP, WBMP, WEBP,
	    WORD, WORDX };
    private static final int FILE_COUNT_LIMIT = 20;
    private static final int FILE_SIZE_LIMIT = 1024 * 1024 * 10; // 10M
    private static final boolean DEBUG = false;
    private static final int THUMBNAIL_WIDTH = 150;
    private static final int THUMBNAIL_HEIGHT = 150;

    @Override
    public String getAcceptTypes() {
	StringBuffer sb = new StringBuffer("");
	for (int i = 0; i < ACCEPT_TYPES.length; i++) {
	    if (i > 0)
		sb.append(',');
	    FileType ft = ACCEPT_TYPES[i];
	    for (int j = 0; j < ft.getMimeTypes().length; j++) {
		if (j > 0)
		    sb.append(',');
		sb.append(ft.getMimeTypes()[j]);
	    }
	}
	return sb.toString();
    }

    @Override
    public int getFileCountLimit() {
	return FILE_COUNT_LIMIT;
    }

    @Override
    public int getFileSizeLimit() {
	return FILE_SIZE_LIMIT;
    }

    @Override
    public boolean isDebug() {
	return DEBUG;
    }

    @Override
    public int getThumnailWidth() {
	return THUMBNAIL_WIDTH;
    }

    @Override
    public int getThumnailHeight() {
	return THUMBNAIL_HEIGHT;
    }
}
