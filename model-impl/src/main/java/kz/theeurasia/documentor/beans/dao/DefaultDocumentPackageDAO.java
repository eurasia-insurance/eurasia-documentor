package kz.theeurasia.documentor.beans.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import kz.theeurasia.documentor.api.dao.DAOException;
import kz.theeurasia.documentor.api.dao.DocumentPackageDAO;
import kz.theeurasia.documentor.api.dao.SearchParameters;
import kz.theeurasia.documentor.model.DocumentPackage;
import kz.theeurasia.documentor.model.DocumentPackage_;

@Stateless
public class DefaultDocumentPackageDAO extends DefaultGenericDAO<Integer, DocumentPackage>
	implements DocumentPackageDAO {

    protected DefaultDocumentPackageDAO() {
	super(DocumentPackage.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<DocumentPackage> findByIdNumber(String idNumber) throws DAOException {
	try {
	    CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<DocumentPackage> cq = cb.createQuery(DocumentPackage.class);
	    Root<DocumentPackage> root = cq.from(DocumentPackage.class);
	    cq.select(root)
		    .where(
			    cb.equal(root.get(DocumentPackage_.idNumber), idNumber));
	    TypedQuery<DocumentPackage> q = em.createQuery(cq);
	    return resultListNoCached(q);
	} catch (Throwable e) {
	    throw new DAOException(e);
	}
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<DocumentPackage> findByIdNumber(SearchParameters parameters) throws DAOException {
	try {
	    CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<DocumentPackage> cq = cb.createQuery(entityClass);
	    Root<DocumentPackage> root = cq.from(entityClass);

	    List<Predicate> whereOptions = new ArrayList<>();

	    // request status
	    if (parameters.getIdNumberPattern() != null && !parameters.getIdNumberPattern().trim().isEmpty()
		    && parameters.getIdNumberPattern().trim().length() >= 3) {
		String pattern = "%" + parameters.getIdNumberPattern().trim() + "%";
		whereOptions.add(cb.like(root.get(DocumentPackage_.idNumber), pattern));
	    }

	    if (whereOptions.isEmpty())
		return null;

	    cq.select(root)
		    .where(cb.and(whereOptions.toArray(new Predicate[0])))
		    .orderBy(cb.desc(root.get(DocumentPackage_.created)));

	    TypedQuery<DocumentPackage> q = em.createQuery(cq);
	    return resultList(q);

	} catch (Throwable e) {
	    throw new DAOException(e);
	}
    }

}
