package me.lei.springblog.domain;

import javax.persistence.*;

@Entity
@Table(name="entry_attachment")
public class EntryAttachment extends Attachment {
//	private int entryId;
	private Entry entry;

//	@Column(name="ENTRY_ID")
//	public int getEntryId() {
//		return entryId;
//	}
//
//	public void setEntryId(int entryId) {
//		this.entryId = entryId;
//	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ENTRY_ID")
	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}
}
