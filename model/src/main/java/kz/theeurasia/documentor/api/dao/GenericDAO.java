package kz.theeurasia.documentor.api.dao;

import kz.theeurasia.documentor.model.GenericEntity;

public interface GenericDAO<I, T extends GenericEntity<I>> {
    T findById(I id) throws EntityNotFound, DAOException;

    T findByIdByPassCache(I id) throws EntityNotFound, DAOException;

    <ET extends T> ET save(ET entity) throws DAOException;
}
