package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.GenericModel;
import play.libs.Codec;

@Entity
@Table(name = "User")
public class User extends GenericModel {
	@Id
	public String id;

	@Column(name = "account") 
	public String account;

	@Column(name = "password")
	public String password;

	public User(String account) {
		this.id = Codec.UUID();
		this.account = account;
		this.password = account;
	}

	public User(String account, String password) {
		this.id = Codec.UUID();
		this.account = account;
		this.password = password;
	}



}