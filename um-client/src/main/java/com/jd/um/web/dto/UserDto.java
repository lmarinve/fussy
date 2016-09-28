package com.jd.um.web.dto;

import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.jd.common.interfaces.IEmailableDto;
import com.jd.common.persistence.model.IEmailableEntity;
import com.jd.um.persistence.model.Principal;
import com.jd.um.persistence.model.Role;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlRootElement
@XStreamAlias("user")
public class UserDto implements IEmailableEntity, IEmailableDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XStreamAsAttribute
    private Long id;

	@XStreamAsAttribute
    @NotNull
	@NotEmpty
	@Size(min = 1, max = 50)
    @Pattern(regexp = "[A-Za-z ]*", message = "Solo puede contener letras y espacios") 
    private String firstname;

	@XStreamAsAttribute
    @NotNull
	@NotEmpty
	@Size(min = 1, max = 50)
    @Pattern(regexp = "[A-Za-z ]*", message = "Solo puede contener letras y espacios") 
    private String lastname;

	@XStreamAsAttribute
    @NotNull
	@NotEmpty
    @Email
    private String email;

	@XStreamAsAttribute
    @NotNull
	@NotEmpty
    private String password;

	@XStreamAsAttribute
    private boolean enabled;

	@XStreamAsAttribute
    private boolean tokenExpired;
 
	@XStreamAsAttribute
    private String cardCode;

    /* Marshalling */
    // - note: this gets rid of the collection entirely
    @XStreamImplicit
    // - note: this requires: xstream.addDefaultImplementation( java.util.HashSet.class, PersistentSet.class );
    // @XStreamConverter( value = HibernateCollectionConverter.class )
    private Set<Role> roles;

    public UserDto() {
        super();
    }

    public UserDto(final String emailToSet, final String passwordToSet, final Set<Role> rolesToSet) {
        super();

        email = emailToSet;
        password = passwordToSet;
        roles = rolesToSet;
    }

    public UserDto(final String firstnameToSet, final String lastnameToSet, final String emailToSet, final String passwordToSet, final Set<Role> rolesToSet, final Boolean enabledToSet, final boolean expiredToSet, final String cardcodeToSet)
    {
        super();

        firstname = firstnameToSet;
        lastname = lastnameToSet;
        email = emailToSet;
        password = passwordToSet;
        roles = rolesToSet;
        enabled = enabledToSet;
        tokenExpired = expiredToSet;
        cardCode = cardcodeToSet;
        
    }


    public UserDto(final Principal users) {
        super();

        id = users.getId();
        firstname = users.getFirstname();
        lastname = users.getLastname();
        roles = users.getRoles();
        enabled = users.isEnabled();
        tokenExpired = users.isTokenExpired();
        cardCode = users.getCardcode();

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstnameToSet) {
        firstname = firstnameToSet;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastnameToSet) {
        lastname = lastnameToSet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String emailToSet) {
        email = emailToSet;
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

    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(final boolean enabledToSet) {
        enabled = enabledToSet;
    }
    
    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(final boolean expiredToSet) {
        tokenExpired = expiredToSet;
    }

     public String getCardcode() {
        return cardCode;
    }

    //

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("users[id=").append(id).append("]")
        .append("users[firstName=").append(firstname).append("]")
        .append("users[lastName=").append(lastname).append("]")
        .append("users[email=").append(email).append("]")
        .append("users[password=").append(password).append("]")
        .append("users[enabled=").append(enabled).append("]")
        .append("users[tokenExpired=").append(tokenExpired).append("]")
        .append("users[cardCode=").append(cardCode).append("]");

        return builder.toString();
    }
}
