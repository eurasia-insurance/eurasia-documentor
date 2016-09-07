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
import kz.theeurasia.documentor.api.dao.SearchParameters;
import kz.theeurasia.documentor.api.dao.UploadedFileDAO;
import kz.theeurasia.documentor.model.DocumentPackage_;
import kz.theeurasia.documentor.model.UploadedFile;
import kz.theeurasia.documentor.model.UploadedFile_;

@Stateless
public class DefaultUploadedFileDAO extends DefaultGenericDAO<Integer, UploadedFile>
	implements UploadedFileDAO {

    protected DefaultUploadedFileDAO() {
	super(UploadedFile.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<UploadedFile> findBySerachParameters(SearchParameters parameters) throws DAOException {
	try {
	    CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<UploadedFile> cq = cb.createQuery(entityClass);
	    Root<UploadedFile> root = cq.from(entityClass);

	    List<Predicate> whereOptions = new ArrayList<>();

	    // idNumber
	    if (parameters.getIdNumberPattern() != null && !parameters.getIdNumberPattern().trim().isEmpty()
		    && parameters.getIdNumberPattern().trim().length() >= 3) {
		String pattern = "%" + parameters.getIdNumberPattern().trim() + "%";
		whereOptions
			.add(cb.like(root.get(UploadedFile_.documentPackage).get(DocumentPackage_.idNumber), pattern));

		// fileName
		if (parameters.getFileNamePattern() != null) {
		    String fpattern = "%" + parameters.getFileNamePattern().trim() + "%";
		    whereOptions
			    .add(cb.like(root.get(UploadedFile_.name), fpattern));
		}
	    }

	    if (whereOptions.isEmpty())
		return null;

	    cq.select(root)
		    .where(cb.and(whereOptions.toArray(new Predicate[0])))
		    .orderBy(cb.desc(root.get(UploadedFile_.documentPackage).get(DocumentPackage_.created)),
			    cb.asc(root.get(UploadedFile_.name)));

	    TypedQuery<UploadedFile> q = em.createQuery(cq);
	    return resultList(q);

	} catch (Throwable e) {
	    throw new DAOException(e);
	}
    }

}
