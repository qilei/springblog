package me.lei.springblog.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="comment_attachment")
public class CommentAttachment extends Attachment implements Serializable {
	private Comment comment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COMMENT_ID")
	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
}
