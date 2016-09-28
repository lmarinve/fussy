package com.jd.um.persistence.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.jd.common.interfaces.IEmailableDto;
import com.jd.common.persistence.model.IEmailableEntity;
import com.jd.um.web.dto.UserDto;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Principal")
@XmlRootElement
public class Principal implements IEmailableEntity, IEmailableDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PRINCIPAL_ID;

    @Column(unique = true, nullable = false)
    @Size(min = 1, max = 50)
    @Pattern(regexp = "[A-Za-z ]*", message = "Solo puede contener letras y espacios") 
    private String firstname;

    @Column(unique = true, nullable = false)
    @Size(min = 1, max = 50)
    @Pattern(regexp = "[A-Za-z ]*", message = "Solo puede contener letras y espacios") 
    private String lastname;

    @Column(unique = true, nullable = false)
    @NotEmpty
    @Email
    private String email;

    @Column(length = 60, unique = true, nullable = false)
    @NotEmpty
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @Column(nullable = false)
    private boolean tokenExpired;
 
    @Column(nullable = true)
    private String cardCode;
    
    // @formatter:off
    @ManyToMany( /* cascade = { CascadeType.REMOVE }, */fetch = FetchType.EAGER)
    @JoinTable(joinColumns = { @JoinColumn(name = "PRINCIPAL_ID", referencedColumnName = "PRINCIPAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID") })
    @XStreamImplicit
    private Set<Role> roles;
    // @formatter:on
    
    // @formatter:off
    //@OneToMany( /* cascade = { CascadeType.REMOVE }, */fetch = FetchType.EAGER)
    //@JoinTable( name = "Principal_Jdcard", joinColumns = @JoinColumn(name = "PRINCIPAL_ID", referencedColumnName = "PRINCIPAL_ID") , inverseJoinColumns = @JoinColumn(name = "JDCARD_ID", referencedColumnName = "PAYMETHOD_ID") )
    //private Set<Paymethod> paymethods;
    // @formatter:on

    // @formatter:off
    //@OneToMany( /* cascade = { CascadeType.REMOVE }, */fetch = FetchType.EAGER)
    //@JoinTable( name = "Principal_Paymethod", joinColumns = @JoinColumn(name = "PRINCIPAL_ID", referencedColumnName = "PRINCIPAL_ID") , inverseJoinColumns = @JoinColumn(name = "PAYMETHOD_ID", referencedColumnName = "PAYMETHOD_ID") )
    //private Set<Paymethod> paymethods;
    // @formatter:on

	
    public Principal() {
        super();
        this.enabled = true;
        this.tokenExpired = false;
    }

    public Principal(final String firstnameToSet, final String lastnameToSet, final String emailToSet, final String passwordToSet, final Set<Role> rolesToSet, final Boolean enabledToSet, final boolean expiredToSet, final String cardcodeToSet)
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
    

    public Principal(final String emailToSet, final String passwordToSet, final Set<Role> rolesToSet) {
        super();

        email = emailToSet;
        password = passwordToSet;
        roles = rolesToSet;
    }


    public Principal(final UserDto userDto) {
        super();

        firstname = userDto.getFirstname();
        lastname = userDto.getLastname();
        email = userDto.getEmail();
        password = userDto.getPassword();
        roles = userDto.getRoles();
        enabled =  userDto.isEnabled();
        tokenExpired =  userDto.isTokenExpired();
        cardCode =  userDto.getCardcode();
    }

    //API
    @Override
    public Long getId() {
        return PRINCIPAL_ID;
    }

    public void setId(final Long idToSet) {
        PRINCIPAL_ID = idToSet;
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

    public void setcardCode(final String cardcodeToSet) {
        cardCode = cardcodeToSet;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        final Principal users = (Principal) obj;
        if (!email.equals(users.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("users[id=").append(PRINCIPAL_ID).append("]")
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