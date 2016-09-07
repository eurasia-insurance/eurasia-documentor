package kz.theeurasia.documentor.beans.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.CacheRetrieveMode;
import javax.persistence.CacheStoreMode;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import kz.theeurasia.documentor.api.dao.DAOException;
import kz.theeurasia.documentor.api.dao.EntityNotFound;
import kz.theeurasia.documentor.api.dao.GenericDAO;
import kz.theeurasia.documentor.model.GenericEntity;

public abstract class DefaultGenericDAO<I, T extends GenericEntity<I>> implements GenericDAO<I, T> {

    private static final String PERSISTENCE_UNIT_NAME = "documentorPU";

    protected static final String HINT_JAVAX_PERSISTENCE_CACHE_STORE_MODE = "javax.persistence.cache.storeMode";
    protected static final String HINT_JAVAX_PERSISTENCE_CACHE_RETREIVE_MODE = "javax.persistence.cache.retreiveMode";

    protected final Class<T> entityClass;

    protected DefaultGenericDAO(Class<T> entityClass) {
	this.entityClass = entityClass;
    }

    @Inject
    protected Logger logger;

    @PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
    protected EntityManager em;

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public T findById(final I id) throws EntityNotFound, DAOException {
	return findByIdHint(id, null);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public T findByIdByPassCache(final I id) throws EntityNotFound, DAOException {
	Map<String, Object> hints = new HashMap<String, Object>();
	hints.put(HINT_JAVAX_PERSISTENCE_CACHE_RETREIVE_MODE, CacheRetrieveMode.BYPASS);
	hints.put(HINT_JAVAX_PERSISTENCE_CACHE_STORE_MODE, CacheStoreMode.REFRESH);
	return findByIdHint(id, hints);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public <ET extends T> ET save(ET entity) throws DAOException {
	try {
	    ET merged = em.merge(entity);
	    em.flush();
	    return merged;
	} catch (Throwable e) {
	    throw new DAOException(String.format("Entity %1$s save failed", entityClass.getCanonicalName()), e);
	}
    }

    // PROTECTED

    protected <X> TypedQuery<X> putNoCacheHints(TypedQuery<X> query) {
	return query
		.setHint(HINT_JAVAX_PERSISTENCE_CACHE_RETREIVE_MODE, CacheRetrieveMode.BYPASS)
		.setHint(HINT_JAVAX_PERSISTENCE_CACHE_STORE_MODE, CacheStoreMode.REFRESH);
    }

    protected <X> List<X> resultListNoCached(TypedQuery<X> query) {
	return putNoCacheHints(query)
		.getResultList();
    }

    protected <X> List<X> resultList(TypedQuery<X> query) {
	return query
		.getResultList();
    }

    // PRIVATE

    private T findByIdHint(final I id, Map<String, Object> hints)
	    throws EntityNotFound, DAOException {
	try {
	    T entity;
	    if (hints == null)
		entity = em.find(entityClass, id);
	    else
		entity = em.find(entityClass, id, hints);
	    if (entity != null)
		return entity;
	} catch (Throwable e) {
	    throw new DAOException(String.format("Entity %1$s findById failed", entityClass.getCanonicalName()), e);
	}
	throw new EntityNotFound(String.format("Not found %1$s with id = '%2$s'", entityClass.getSimpleName(), id));
    }

}
