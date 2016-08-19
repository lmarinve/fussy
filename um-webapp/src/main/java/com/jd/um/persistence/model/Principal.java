package com.jd.um.persistence.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @NotEmpty
    @Email
    private String email;

     @NotNull
    @Size(min = 1, max = 50)
    @Pattern(regexp = "[A-Za-z ]*", message = "Solo puede contener letras y espacios") 
    private String firstname;

    @NotNull
    @Size(min = 1, max = 50)
    @Pattern(regexp = "[A-Za-z ]*", message = "Solo puede contener letras y espacios") 
    private String lastname;

    @Column(length = 60)
    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    private boolean enabled;

    @NotNull
    private boolean tokenExpired;
 
    private String cardCode;
    
    //

    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id") , inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") )
    private Collection<roles> role;

    public users() {
        super();
        this.enabled = true;
        this.tokenExpired = false;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

     public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
    
    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(final String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(final String lastName) {
        this.lastname = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String username) {
        this.email = username;
    }

    public Collection<roles> getRoles() {
        return role;
    }

    public void setRoles(final Collection<roles> role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
    
    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(final boolean expired) {
        this.tokenExpired = expired;
    }

     public String getcardCode() {
        return cardCode;
    }

    public void setcardCode(final String cardCode) {
        this.cardCode = cardCode;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardCode == null) ? 0 : cardCode.hashCode());
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
        final users user = (users) obj;
        if (!cardCode.equals(user.cardCode)) {
            return false;
        }
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