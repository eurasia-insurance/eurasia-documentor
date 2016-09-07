package kz.theeurasia.documentor.beans.facade;

import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.omnifaces.cdi.ViewScoped;

import com.lapsa.image.ImageContent;
import com.lapsa.image.ImageProcessingFactory;
import com.lapsa.image.ImageProcessingFactory.FixedResizeMode;
import com.lapsa.image.ImageProcessingFactoryProvider;

import kz.theeurasia.documentor.model.UploadedFile;

@ViewScoped
public class Thumbnails implements Serializable {
    private static final long serialVersionUID = -5497629510988228060L;

    class Thumbnail {
	final int width;
	final int height;
	final byte[] content;

	public Thumbnail(int width, int height, byte[] content) {
	    this.width = width;
	    this.height = height;
	    this.content = content;
	}
    }

    private Map<Integer, Thumbnail> cache = new HashMap<>();

    public byte[] getThumbnail(UploadedFile file, int width, int height) {
	if (file == null)
	    return null;
	Integer key = file.hashCode();

	Thumbnail th;
	if (!(cache.containsKey(key) && (th = cache.get(key)) != null && th.width == width
		&& th.height == height)) {
	    th = generate(file, width, height);
	    cache.put(key, th);
	}

	return th.content;
    }

    // PRIVATE

    private Thumbnail generate(UploadedFile file, int width, int height) {
	ImageProcessingFactory factory = ImageProcessingFactoryProvider.getInstance();
	ImageContent orig = new ImageContent(file.getContent());
	ImageContent thmb = factory.resizeImageContent(orig, FixedResizeMode.FIT, width, height,
		Color.WHITE);
	return new Thumbnail(width, height, thmb.getContent());
    }

}
