package com.nonononoki.alovoa.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.nonononoki.alovoa.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserNotification {
	
	@Transient
	public static final String USER_LIKE = "USER_LIKE";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User userFrom;
	
	@ManyToOne
	@JoinColumn
	private User userTo;
	
	private String content;
	private Date date;
	
}