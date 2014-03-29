package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.GenericModel;
import play.libs.Codec;

@Entity
@Table(name = "Project")
public class Project extends GenericModel {
	@Id
	public String id;

	@Column(name = "img_address") 
	public String imgAddress;

	@Column(name = "descript")
	public String descript;

	public Project() {
		this.id = Codec.UUID();
	}

}