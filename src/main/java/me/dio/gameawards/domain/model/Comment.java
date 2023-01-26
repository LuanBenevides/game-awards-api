package me.dio.gameawards.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity(name = "comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn
	@Column(name = "user_Id")
	private Long userID;
	
	@JoinColumn
	@Column(name = "avaluation_Id")
	private Long avaluationId;
	
	@Column(name = "comment_Text", length = 1000)
	private String commentText;
	
	@Column(name = "comment_Type")
	private String commentType; //answer or comment

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Long getAvaluationId() {
		return avaluationId;
	}

	public void setAvaluationId(Long avaluationId) {
		this.avaluationId = avaluationId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}
}
