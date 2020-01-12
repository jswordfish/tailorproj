package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registredUserMessage")
public class RegisteredUserMessage {

	@Id
	@Column(name="id", length=10)
	private int id;
	
	@Column(name="message")
	private String message;
	
	@Column(name="messageDate")
	private String messageDate;
	
	@Column(name="statusRead")
	private Number statusRead;
	
	@Column(name="messageType")
	private String messageTypeCustomerTailor;
	
	 @OneToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id")
	 private RegisteredUser parentUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}

	public Number getStatusRead() {
		return statusRead;
	}

	public void setStatusRead(Number statusRead) {
		this.statusRead = statusRead;
	}

	public String getMessageTypeCustomerTailor() {
		return messageTypeCustomerTailor;
	}

	public void setMessageTypeCustomerTailor(String messageTypeCustomerTailor) {
		this.messageTypeCustomerTailor = messageTypeCustomerTailor;
	}

	public RegisteredUser getParentUser() {
		return parentUser;
	}

	public void setParentUser(RegisteredUser parentUser) {
		this.parentUser = parentUser;
	}

	public RegisteredUserMessage(int id, String message, String messageDate, Number statusRead,
			String messageTypeCustomerTailor, RegisteredUser parentUser) {
		super();
		this.id = id;
		this.message = message;
		this.messageDate = messageDate;
		this.statusRead = statusRead;
		this.messageTypeCustomerTailor = messageTypeCustomerTailor;
		this.parentUser = parentUser;
	}

	public RegisteredUserMessage() {
		super();
	}
	 
	 
	 
	

}
