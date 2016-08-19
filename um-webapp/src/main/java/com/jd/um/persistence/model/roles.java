package com.jd.um.persistence.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany(mappedBy = "role")
    private Collection<users> user;

    @ManyToMany
    @JoinTable(name = "roles_privileges", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") , inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "id") )
    private Collection<privileges> privilege;
 
    private String name;

    public roles() {
        super();
    }

    public roles(final String name) {
        super();
        this.name = name;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    public Collection<users> getUsers() {
        return user;
    }

    public void setUsers(final Collection<users> user) {
        this.user = user;
    }

    public Collection<privileges> getPrivileges() {
        return privilege;
    }

    public void setPrivileges(final Collection<privileges> privilege) {
        this.privilege = privilege;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof roles))
			return false;
		roles other = (roles) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("roles [name=").append(name).append("]").append("[id=").append(id).append("]");
        return builder.toString();
    }
}