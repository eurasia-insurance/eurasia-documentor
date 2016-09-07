package kz.theeurasia.documentor.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum FileType {
    JPEG("fa-file-image-o", true, "image/jpeg", "image/pjpeg"), //
    GIF("fa-file-image-o", true, "image/gif"), //
    PNG("fa-file-image-o", true, "image/png"), //
    PDF("fa-file-pdf-o", false, "application/pdf"), //
    TIFF("fa-file-image-o", true, "image/tiff"), //
    SVG("fa-file-image-o", true, "image/svg+xml"), //
    WBMP("fa-file-image-o", true, "image/vnd.wap.wbm"), //
    WEBP("fa-file-image-o", true, "image/webp"), //
    EXCEL("fa-file-excel-o", false, "application/vnd.ms-excel"), //
    EXCELX("fa-file-excel-o", false, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"), //
    WORD("fa-file-word-o", false, "application/msword"), //
    WORDX("fa-file-word-o", false, "application/vnd.openxmlformats-officedocument.wordprocessingml.document"), //
    ZIP("fa-file-archive-o", false, "application/zip"), //
    TEXT("fa-file-text", false, "text/plain"), //
    ;

    private final String fontAwesomeClass;
    private final String[] mimeTypes;
    private final boolean image;

    private FileType(String fontAwesomeClass, boolean image, String mimeType, String... mimeTypeVariants) {
	this.fontAwesomeClass = fontAwesomeClass;
	List<String> types = new ArrayList<>();
	types.add(mimeType);
	Collections.addAll(types, mimeTypeVariants);
	this.mimeTypes = types.toArray(new String[0]);
	this.image = image;
    }

    public String getMimeType() {
	return mimeTypes[0];
    }

    public static FileType forMimeType(String mimeType) {
	for (FileType ft : FileType.values())
	    for (String mt : ft.mimeTypes)
		if (mt.equals(mimeType))
		    return ft;
	return null;
    }

    // GENERATED

    public String getFontAwesomeClass() {
	return fontAwesomeClass;
    }

    public String[] getMimeTypes() {
	return mimeTypes;
    }

    public boolean isImage() {
	return image;
    }

}
