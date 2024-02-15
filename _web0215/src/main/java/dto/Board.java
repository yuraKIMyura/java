package dto;
/**DTO: DB에서 column 값을 받아서 저장하는 container 용도**/

public class Board {
	
	/**DB에 있는 column을 field로 설정**/
	//DTO의 field명과 DB의 column명이 달라도 상관 없지만, 경제성을 위해 통일하는 것이 바람직하다.
	private int num;
	private String writer;
	private String title;
	private String content;
	private String regtime;
	private int hits;
	
	
	public Board(int num, String writer, String title, String content, String regtime, int hits) {
		this(num, writer, title, content, regtime);
		this.hits = hits;
	}
	
	public Board(int num, String writer, String title, String content, String regtime) {
		this(writer, title, content, regtime);
		this.num = num;
	}
	
	public Board(String writer, String title, String content, String regtime) {
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
	}



	@Override
	public String toString() {
		return "Board [num=" + num + ", writer=" + writer + ", title=" + title + ", content=" + content + ", regtime="
				+ regtime + ", hits=" + hits + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
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
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	

}
