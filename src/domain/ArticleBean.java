package domain;

public class ArticleBean {
	private String title, content, writer, regdate, pass;
	private int seq;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "ArticleBean \n"
				+ "[title=" + title + "\n" 
				+ "content=" + content + "\n"
				+ "writer=" + writer + "\n"
				+ "regdate=" + regdate + "\n"
				+ "seq=" + seq + "]";
	}
}