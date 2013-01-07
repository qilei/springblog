package me.lei.springblog.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="entry")
public class Entry implements Serializable {
	private int id;
	private String subject;
	private String body;
	private Date postDate;
	
	@Enumerated(EnumType.STRING)
	private Visibility visibility;
	private Category category;
	private Set<Comment> comments;
	private Set<EntryAttachment> attachments;

	public Entry() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name="POST_DATE")
	@Temporal(value=TemporalType.DATE)
	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@OneToMany(mappedBy="entry",fetch=FetchType.EAGER)
	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(mappedBy="entry",fetch=FetchType.LAZY)
	public Set<EntryAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(Set<EntryAttachment> attachments) {
		this.attachments = attachments;
	}

	
	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

}
