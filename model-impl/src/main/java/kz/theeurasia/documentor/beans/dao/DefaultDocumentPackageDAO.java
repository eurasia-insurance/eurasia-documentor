package kz.theeurasia.documentor.beans.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import kz.theeurasia.documentor.api.dao.DAOException;
import kz.theeurasia.documentor.api.dao.DocumentPackageDAO;
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

}
