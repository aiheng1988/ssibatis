package cn.ahern88.ssibatis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 留言信息实体类
 * @author ahern88
 * @date 2013-8-23
 */
public class Content {
	
	private int id;
	
	private String title;
	
	private String url;
	
	private String email;
	
	private String content;
	
	private Date date;
	
	public Content(int id){
		this.id = id;
	}
	
	public Content(int id, String title, String url, String email,
			String content, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.email = email;
		this.content = content;
		this.date = date;
	}
	
	public Content(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String toString(){
		return "[id:" + this.id + ", title:" + this.title + ", content:" + this.content + ", date:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.date) + "]";
	}

}
