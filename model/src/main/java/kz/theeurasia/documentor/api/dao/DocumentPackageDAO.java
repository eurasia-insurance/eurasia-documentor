package kz.theeurasia.documentor.api.dao;

import java.util.List;

import kz.theeurasia.documentor.model.DocumentPackage;

public interface DocumentPackageDAO extends GenericDAO<Integer, DocumentPackage> {
    List<DocumentPackage> findByIdNumber(String idNumber) throws DAOException;
}
