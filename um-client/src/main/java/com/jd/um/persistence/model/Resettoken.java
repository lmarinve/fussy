package com.jd.um.persistence.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.jd.common.interfaces.INameableDto;
import com.jd.common.persistence.model.INameableEntity;

@Entity
@Table(name="Resettoken")
@XmlRootElement
public class Resettoken implements INameableEntity, INameableDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int expirationToSet = 60 * 24;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RESET_ID")
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToOne(targetEntity = Principal.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private Principal users;

	@Column(name = "expirydate")
    private Date expirydate;

    public Resettoken() {
        super();
    }

    public Resettoken(final String tokenToSet) {
        super();

        name = tokenToSet;
        expirydate = calculateExpiryDate(expirationToSet);
    }

    public Resettoken(final String tokenToSet, final Principal userToSet) {
        super();

        name = tokenToSet;
        users = userToSet;
        expirydate = calculateExpiryDate(expirationToSet);
    }

    //
    @Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long idToSet) {
		id = idToSet;
	}

	@Override
	public String getName() {
		return name;
	}

    public void setName(final String nameToSet) {
        name = nameToSet;
    }

    public Principal getUser() {
        return users;
    }

    public void setUser(final Principal userToSet) {
        users = userToSet;
    }

    public Date getExpiryDate() {
        return expirydate;
    }

    public void setExpiryDate(final Date expirydateToSet) {
        expirydate = expirydateToSet;
    }

    private Date calculateExpiryDate(final int expiryTimeInMinutes) {
        final Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }

    public void updateToken(final String tokenToSet) {
        name = tokenToSet;
        expirydate = calculateExpiryDate(expirationToSet);
    }

    //

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((expirydate == null) ? 0 : expirydate.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((users == null) ? 0 : users.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resettoken other = (Resettoken) obj;
        if (expirydate == null) {
            if (other.expirydate != null) {
                return false;
            }
        } else if (!expirydate.equals(other.expirydate)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (users == null) {
            if (other.users != null) {
                return false;
            }
        } else if (!users.equals(other.users)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Token [String=").append(name).append("]").append("[Expires").append(expirydate).append("]");
        return builder.toString();
    }

	
}
