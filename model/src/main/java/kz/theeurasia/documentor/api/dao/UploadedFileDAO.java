package kz.theeurasia.documentor.api.dao;

import java.util.List;

import kz.theeurasia.documentor.model.UploadedFile;

public interface UploadedFileDAO extends GenericDAO<Integer, UploadedFile> {
    List<UploadedFile> findBySerachParameters(SearchParameters parameters) throws DAOException;
}
