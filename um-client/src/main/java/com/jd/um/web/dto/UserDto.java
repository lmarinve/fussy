package com.jd.um.web.dto;

import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.jd.common.interfaces.INameableDto;
import com.jd.common.persistence.model.INameableEntity;
import com.jd.um.persistence.model.Principal;
import com.jd.um.persistence.model.Role;
import org.hibernate.validator.constraints.Email;

@XmlRootElement
public class UserDto implements INameableEntity, INameableDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    private String password;

    private Set<Role> roles;

    public UserDto() {
        super();
    }

    public UserDto(final String name, final String email, final String password, final Set<Role> roles) {
        super();

        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UserDto(final Principal principal) {
        super();

        name = principal.getName();
        email = principal.getEmail();
        roles = principal.getRoles();
        id = principal.getId();
    }

    // API

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(final Long idToSet) {
        id = idToSet;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(final String nameToSet) {
        name = nameToSet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String passwordToSet) {
        password = passwordToSet;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Set<Role> rolesToSet) {
        roles = rolesToSet;
    }

    //

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((roles == null) ? 0 : roles.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserDto other = (UserDto) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (roles == null) {
            if (other.roles != null)
                return false;
        } else if (!roles.equals(other.roles))
            return false;
        return true;
    }

}
