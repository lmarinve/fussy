package com.jd.um.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Cardcheck")
@XmlRootElement
public class Cardcheck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private Long id;
    
    @Column(unique = true, nullable = false)
    @Size(min = 16, max = 16)
	@Pattern(regexp = "(^$|[0-9]{16})")
	private String fuelCardCode;

    @Column(unique = true, nullable = false)
    @NotEmpty
    private String estatus;

    @Column()
	private String cardCode;

    @Column()
    private String cardName;

    @Column()
    private String aircraftCode;
    @Column()
	private String sagroup;
    @Column()
	private String sacurrency;
    @Column()
	private long sabalance;
    @Column()
	private String sacreditcondition;
    @Column()
	private int saNdays;
    @Column()
	private long saAccumulated;
    @Column()
	private int saQttinv;
    @Column()
	private String ltdgroup;
    @Column()
	private String ltdcurrency;
    @Column()
	private long ltdbalance;
    @Column()
	private String ltdcreditcondition;
    @Column()
	private int ltdNdays;
    @Column()
	private long ltdAccumulated;
    @Column()
	private int ltdQttinv;
    @Column()
	private String incgroup;
    @Column()
	private String inccurrency;
    @Column()
	private long incbalance;
    @Column()
	private String inccreditcondition;
    @Column()
	private int incNdays;
    @Column()
	private long incAccumulated;
    @Column()
	private int incQttinv;
    
    //
    public Cardcheck() {
        super();
    }
    
    // API
    public Long getId() {
		return id;
	}

	public void setId(final Long idToSet) {
		id = idToSet;
	}

	public String getFuelCardCode() {
		return fuelCardCode;
	}


	public void setFuelCardCode(final String fuelcardcodeToSet) {
		fuelCardCode = fuelcardcodeToSet;
	}


	public String getEstatus() {
		return estatus;
	}


	public void setEstatus(String estatusToSet) {
		estatus = estatusToSet;
	}


	public String getCardCode() {
		return cardCode;
	}


	public void setCardName(String cardnameToSet) {
		cardName = cardnameToSet;
	}

	public String getCardName() {
		return cardName;
	}


	public void setCardCode(String cardcodeToSet) {
		cardCode = cardcodeToSet;
	}

	public String getAircraftCode() {
		return aircraftCode;
	}


	public void setAircraftCode(String aircraftcodeToSet) {
		aircraftCode = aircraftcodeToSet;
	}


	public String getSagroup() {
		return sagroup;
	}


	public void setSagroup(String sagroupToSet) {
		sagroup = sagroupToSet;
	}


	public String getSacurrency() {
		return sacurrency;
	}


	public void setSacurrency(String sacurrencyToSet) {
		sacurrency = sacurrencyToSet;
	}


	public long getSabalance() {
		return sabalance;
	}


	public void setSabalance(long sabalanceToSet) {
		sabalance = sabalanceToSet;
	}


	public String getSacreditcondition() {
		return sacreditcondition;
	}


	public void setSacreditcondition(String sacreditconditionToSet) {
		sacreditcondition = sacreditconditionToSet;
	}


	public int getSaNdays() {
		return saNdays;
	}


	public void setSaNdays(int saNdaysToSet) {
		saNdays = saNdaysToSet;
	}


	public long getSaAccumulated() {
		return saAccumulated;
	}


	public void setSaAccumulated(long saaccumulatedToSet) {
		saAccumulated = saaccumulatedToSet;
	}


	public int getSaQttinv() {
		return saQttinv;
	}


	public void setSaQttinv(int saqttinvToSet) {
		saQttinv = saqttinvToSet;
	}


	public String getLtdgroup() {
		return ltdgroup;
	}


	public void setLtdgroup(String ltdgroupToSet) {
		ltdgroup = ltdgroupToSet;
	}


	public String getLtdcurrency() {
		return ltdcurrency;
	}


	public void setLtdcurrency(String ltdcurrencyToSet) {
		ltdcurrency = ltdcurrencyToSet;
	}


	public long getLtdbalance() {
		return ltdbalance;
	}


	public void setLtdbalance(long ltdbalanceToSet) {
		ltdbalance = ltdbalanceToSet;
	}


	public String getLtdcreditcondition() {
		return ltdcreditcondition;
	}


	public void setLtdcreditcondition(String ltdcreditconditionToSet) {
		ltdcreditcondition = ltdcreditconditionToSet;
	}


	public int getLtdNdays() {
		return ltdNdays;
	}


	public void setLtdNdays(int ltdNdaysToSet) {
		ltdNdays = ltdNdaysToSet;
	}


	public long getLtdAccumulated() {
		return ltdAccumulated;
	}


	public void setLtdAccumulated(long ltdaccumulatedToSet) {
		ltdAccumulated = ltdaccumulatedToSet;
	}


	public int getLtdQttinv() {
		return ltdQttinv;
	}


	public void setLtdQttinv(int ltdqttinvToSet) {
		ltdQttinv = ltdqttinvToSet;
	}


	public String getIncgroup() {
		return incgroup;
	}


	public void setIncgroup(String incgroupToSet) {
		incgroup = incgroupToSet;
	}


	public String getInccurrency() {
		return inccurrency;
	}


	public void setInccurrency(String inccurrencyToSet) {
		inccurrency = inccurrencyToSet;
	}


	public long getIncbalance() {
		return incbalance;
	}


	public void setIncbalance(long incbalanceToSet) {
		incbalance = incbalanceToSet;
	}


	public String getInccreditcondition() {
		return inccreditcondition;
	}


	public void setInccreditcondition(String inccreditconditionToSet) {
		inccreditcondition = inccreditconditionToSet;
	}


	public int getIncNdays() {
		return incNdays;
	}


	public void setIncNdays(int incndaysToSet) {
		incNdays = incndaysToSet;
	}


	public long getIncAccumulated() {
		return incAccumulated;
	}


	public void setIncAccumulated(long incaccumulatedToSet) {
		incAccumulated = incaccumulatedToSet;
	}


	public int getIncQttinv() {
		return incQttinv;
	}


	public void setIncQttinv(int incqttinvToSet) {
		incQttinv = incqttinvToSet;
	}

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fuelCardCode == null) ? 0 : fuelCardCode.hashCode());
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
        final Cardcheck validation = (Cardcheck) obj;
        if (!fuelCardCode.equals(validation.fuelCardCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("validation[fuelCardCode=").append(fuelCardCode).append("]")
        .append("validation[Status=").append(estatus).append("]")
        .append("validation[cardCode=").append(cardCode).append("]")
        .append("validation[cardName=").append(cardName).append("]")
        .append("validation[aircraftCode=").append(aircraftCode).append("]")
        .append("validation[sagroup=").append(sagroup).append("]")
        .append("validation[sacurrency=").append(sacurrency).append("]")
        .append("validation[sabalance=").append(sabalance).append("]")
        .append("validation[sacreditcondition=").append(sacreditcondition).append("]")
        .append("validation[saNdays=").append(saNdays).append("]")
        .append("validation[saAccumulated=").append(saAccumulated).append("]")
        .append("validation[saQttinv=").append(saQttinv).append("]")
        .append("validation[ltdgroup=").append(ltdgroup).append("]")
        .append("validation[ltdcurrency=").append(ltdcurrency).append("]")
        .append("validation[ltdbalance=").append(ltdbalance).append("]")
        .append("validation[ltdcreditcondition=").append(ltdcreditcondition).append("]")
        .append("validation[ltdNdays=").append(ltdNdays).append("]")
        .append("validation[ltdAccumulated=").append(ltdAccumulated).append("]")
        .append("validation[ltdQttinv=").append(ltdQttinv).append("]")
        .append("validation[incgroup=").append(incgroup).append("]")
        .append("validation[inccurrency=").append(inccurrency).append("]")
        .append("validation[incbalance=").append(incbalance).append("]")
        .append("validation[inccreditcondition=").append(inccreditcondition).append("]")
        .append("validation[incNdays=").append(incNdays).append("]")
        .append("validation[incAccumulated=").append(incAccumulated).append("]")
        .append("validation[incQttinv=").append(incQttinv).append("]");
        return builder.toString();
    }

}