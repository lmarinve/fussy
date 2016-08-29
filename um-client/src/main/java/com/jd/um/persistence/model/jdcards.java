package com.jd.um.persistence.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

import com.jd.common.interfaces.INameableDto;
import com.jd.common.persistence.model.INameableEntity;

@Entity
@Table(name = "jdcards")
@XmlRootElement
public class jdcards {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 16, max = 16)
	@Pattern(regexp = "(^$|[0-9]{16})")
	private String cardCode;

    @NotNull
    @NotEmpty
    private String status;
	private long balance;
	private String observations;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
