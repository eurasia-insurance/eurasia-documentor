package kz.theeurasia.documentor.api.facade;

import org.primefaces.model.StreamedContent;

import kz.theeurasia.documentor.model.UploadedFile;

public interface FunctionFacade {
    byte[] thumbnail(UploadedFile file, int width, int height);

    StreamedContent download(UploadedFile file);
}