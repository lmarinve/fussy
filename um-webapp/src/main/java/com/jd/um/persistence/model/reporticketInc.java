package com.jd.um.persistence.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reporticketInc")
public class reporticketInc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String cardCode;
    private String cardName;
    private String ticket;
    private String ticketDate;
    private String syncDate;
    private long qttyGals;
    private long qttyLiters;
    private String itemProduct;
    private long itemPrice;
    private long itemSellPrice;
    private int docEntry;
    private int docNum;
    private String lineStatus;
    private int docNumOinv;
    private Date invoiceIssueDate;
    private String aircraftCode;
    private String provider;
    private String cmpAero;
    private String serviceFee;
    private String provStatus;
    private String invoiceProvider;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getSyncDate() {
		return syncDate;
	}
	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}
	public long getQttyGals() {
		return qttyGals;
	}
	public void setQttyGals(long qttyGals) {
		this.qttyGals = qttyGals;
	}
	public long getQttyLiters() {
		return qttyLiters;
	}
	public void setQttyLiters(long qttyLiters) {
		this.qttyLiters = qttyLiters;
	}
	public String getItemProduct() {
		return itemProduct;
	}
	public void setItemProduct(String itemProduct) {
		this.itemProduct = itemProduct;
	}
	public long getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(long itemPrice) {
		this.itemPrice = itemPrice;
	}
	public long getItemSellPrice() {
		return itemSellPrice;
	}
	public void setItemSellPrice(long itemSellPrice) {
		this.itemSellPrice = itemSellPrice;
	}
	public int getDocEntry() {
		return docEntry;
	}
	public void setDocEntry(int docEntry) {
		this.docEntry = docEntry;
	}
	public int getDocNum() {
		return docNum;
	}
	public void setDocNum(int docNum) {
		this.docNum = docNum;
	}
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}
	public int getDocNumOinv() {
		return docNumOinv;
	}
	public void setDocNumOinv(int docNumOinv) {
		this.docNumOinv = docNumOinv;
	}
	public Date getInvoiceIssueDate() {
		return invoiceIssueDate;
	}
	public void setInvoiceIssueDate(Date invoiceIssueDate) {
		this.invoiceIssueDate = invoiceIssueDate;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getCmpAero() {
		return cmpAero;
	}
	public void setCmpAero(String cmpAero) {
		this.cmpAero = cmpAero;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getProvStatus() {
		return provStatus;
	}
	public void setProvStatus(String provStatus) {
		this.provStatus = provStatus;
	}
	public String getInvoiceProvider() {
		return invoiceProvider;
	}
	public void setInvoiceProvider(String invoiceProvider) {
		this.invoiceProvider = invoiceProvider;
	}
	
	
}
