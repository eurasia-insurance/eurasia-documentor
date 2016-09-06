package kz.theeurasia.documentor.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@MappedSuperclass
public abstract class GenericEntity<T> {

    protected transient final UUID uuid = UUID.randomUUID();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected T id;

    @Override
    public int hashCode() {
	HashCodeBuilder hcb = new HashCodeBuilder(getPrime(), getMultiplier());
	return id == null ? hcb.append(uuid).toHashCode() : hcb.append(id).toHashCode();
    }

    protected abstract int getMultiplier();

    protected abstract int getPrime();

    @Override
    public boolean equals(Object other) {
	if (other == null || other.getClass() != getClass())
	    return false;
	if (other == this)
	    return true;

	@SuppressWarnings("unchecked")
	GenericEntity<T> that = (GenericEntity<T>) other;
	EqualsBuilder eb = new EqualsBuilder();
	return id == null ? eb.append(uuid, that.uuid).isEquals() : eb.append(id, that.id).isEquals();
    }

    // GENERATED

    public T getId() {
	return id;
    }

    @Deprecated
    public void setId(T id) {
	this.id = id;
    }

}
