package com.cg.paymentwallet.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class ClientTransactions implements Serializable {
	private static final long serialVersionUID = 1L;
	private LocalDateTime tDate;
	private LocalDateTime dDate;
	private LocalDateTime wDate;
	private String tType;
	private BigInteger mobileNumberOther;
	private double amount;
	private double balance;
	public LocalDateTime gettDate() {
		return tDate;
	}
	public void settDate(LocalDateTime tDate) {
		this.tDate = tDate;
	}
	public LocalDateTime getdDate() {
		return dDate;
	}
	public void setdDate(LocalDateTime dDate) {
		this.dDate = dDate;
	}
	public LocalDateTime getwDate() {
		return wDate;
	}
	public void setwDate(LocalDateTime wDate) {
		this.wDate = wDate;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public BigInteger getMobileNumberOther() {
		return mobileNumberOther;
	}
	public void setMobileNumberOther(BigInteger mobileNumberOther) {
		this.mobileNumberOther = mobileNumberOther;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ClientTransactions [tDate=" + tDate + ", dDate=" + dDate + ", wDate=" + wDate + ", tType=" + tType
				+ ", mobileNumberOther=" + mobileNumberOther + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
}