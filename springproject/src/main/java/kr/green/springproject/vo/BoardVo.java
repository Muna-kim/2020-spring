package kr.green.springproject.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVo {
	private int num;
	private Date registerDate;
	private String title;
	private String content;
	private String writer;
	private char isDel;
	
	
	
	
	
	public char getIsDel() {
		return isDel;
	}
	public void setIsDel(char isDel) {
		this.isDel = isDel;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRegisterDate() {
		SimpleDateFormat transFormat = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String to = transFormat.format(registerDate);
		return to;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
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
	@Override
	public String toString() {
		return "BoardVo [num=" + num + ", registerDate=" + registerDate + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + ", isDel=" + isDel + "]";
	}
	
	
	
	
}
