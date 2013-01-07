package me.lei.springblog.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="comment")
public class Comment implements Serializable {
	private int id;
	private String body;
	private String postBy;
	private Date postDate;
	private Entry entry;
	private Set<CommentAttachment> attachments;

	public Comment() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name="POST_BY")
	public String getPostBy() {
		return postBy;
	}

	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}

	@Column(name="POST_DATE")
	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ENTRY_ID")
	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	@OneToMany(mappedBy="comment",fetch=FetchType.LAZY)
	public Set<CommentAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(Set<CommentAttachment> attachments) {
		this.attachments = attachments;
	}
}
