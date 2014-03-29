package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.GenericModel;
import play.libs.Codec;

@Entity
@Table(name = "Activity")
public class Activity extends GenericModel {
	@Id
	public String id;

	@Column(name = "title") 
	public String title;

	@Column(name = "content")
	public String content;

	@Column(name = "start_time")
	public String startTime;

	@Column(name = "end_time")
	public String endTime;

	@Column(name = "limit_member")
	public int limitMenber;

	@Column(name = "userId") //创建活动人的Id
	public String userId;


	public Activity() {
		this.id = Codec.UUID();
	}

}