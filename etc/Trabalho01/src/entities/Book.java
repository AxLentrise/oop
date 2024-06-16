package entities;

import java.time.LocalDateTime;

public class Book {

	private static final StringBuilder builder = new StringBuilder();
	
	private String title;
	private String writer;
	private LocalDateTime publishDate;
	
	public Book() {}
	
	public Book(String title, String writer, LocalDateTime publishDate) {
		this.title = title;
		this.writer = writer;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublishDate() {
		return this.publishDate.toString();
	}

	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}
	
	@Override
	public String toString() {
		builder.setLength(0);
		builder.append(String.format("Title: %s\n", this.title));
		builder.append(String.format("Writer: %d\n", this.writer));
		builder.append(String.format("Publish Date: %s\n", this.publishDate.toString()));
		return builder.toString();
	}
	
}
