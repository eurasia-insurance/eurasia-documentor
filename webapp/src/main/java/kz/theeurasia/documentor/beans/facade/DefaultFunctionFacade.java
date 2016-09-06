package kz.theeurasia.documentor.beans.facade;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import kz.theeurasia.documentor.api.facade.FunctionFacade;
import kz.theeurasia.documentor.model.UploadedFile;

@Named("functionFacade")
@ApplicationScoped
public class DefaultFunctionFacade implements FunctionFacade {

    @Inject
    private Thumbnails thumbnails;

    @Override
    public byte[] thumbnail(UploadedFile file, int width, int height) {
	if (file != null && file.getType() != null && !file.getType().isImage())
	    return null;
	return thumbnails.getThumbnail(file, width, height);
    }

    @Override
    public StreamedContent download(UploadedFile file) {
	ByteArrayInputStream bais = new ByteArrayInputStream(file.getContent());
	String title = convertFileName(file.getName());
	StreamedContent sc = new DefaultStreamedContent(bais, file.getType().getMimeType(), title);
	return sc;
    }

    // PRIVATE

    private String convertFileName(String fileName) {
	try {
	    String res = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
	    return res;
	} catch (UnsupportedEncodingException e) {
	    return fileName;
	}

    }
}
