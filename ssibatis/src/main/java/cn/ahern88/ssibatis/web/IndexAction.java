package cn.ahern88.ssibatis.web;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import cn.ahern88.ssibatis.commons.Page;
import cn.ahern88.ssibatis.entity.Content;
import cn.ahern88.ssibatis.service.ContentService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ahern88
 * @date 2013-8-26 下午5:09:10
 */
public class IndexAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{

	private static final long serialVersionUID = 7180862047169059084L;
	private static final Log LOG = LogFactory.getLog(IndexAction.class);
	private static final Pattern emailer = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
	private static final Pattern urler = Pattern.compile("^(http)?(://)?(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*((:\\d+)?)(/(\\w+(-\\w+)*))*(\\.?(\\w)*)(\\?)?(((\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*(\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*)*(\\w*)*)$",Pattern.CASE_INSENSITIVE ); 
	
	private ContentService contentService;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private int page = 1;
	private int id;
	private String title;
	private String email;
	private String url;
	private String content;
	private Date date = new Date();

	@Override
	public String execute() throws Exception {
		Page pageObj = getPage();
		List<Content> contents = contentService.getContentsByPage(pageObj);
		request.setAttribute("contents", contents);
		if(pageObj.getTotalpage() > 0)
		request.setAttribute("page", pageObj.page());
		return SUCCESS;
	}
	
	public String preedit() throws Exception {
		if(0 == id){
			LOG.error("id is null");
			return INPUT;
		}
		Content con = contentService.getContentById(id);
		request.setAttribute("content", con);
		return "preedit";
	}
	
	public String preadd() throws Exception {
		return "preadd";
	}
	
	public String save() throws Exception {
		Content con = new Content(id, title, url, email, content, date);
		boolean flag = false;
		if(con.getId() > 0){
			flag = contentService.updateContent(con);
			request.setAttribute("content", con);
		} else {
			flag = contentService.insert(con) > 0;
		}
		if(flag){
			request.setAttribute("result", "保存成功");
		} else {
			request.setAttribute("result", "保存失败");
		}
		return "preadd";
	}
	
	/**
	 * 在save之前校验
	 */
	public void validateSave(){
		if(StringUtils.isBlank(title)){
			this.addFieldError("title", "请输入标题信息");
		}
		if(StringUtils.isBlank(content)){
			this.addFieldError("content", "请输入内容信息");
		}
		if(StringUtils.isNotBlank(email)){
			if(!emailer.matcher(email).matches()){
				this.addFieldError("email", "请输入正确的邮箱");
			}
		}
		if(StringUtils.isNotBlank(url)){
			if(!urler.matcher(url).matches()){
				this.addFieldError("url", "请输入正确的网址");
			}
		}
	}
	
	public String del() throws Exception {
		if(0 == id){
			LOG.error("id is null");
			return INPUT;
		}
		Content con = contentService.getContentById(id);
		if(null == con){
			return error("删除失败，可能id不存在");
		}
		if(contentService.deleteById(con.getId())){
			return "delsuccess";
		} else {
			return error("删除失败，可能id不存在");
		}
	}

	public void setContentService(ContentService contentService) {
		this.contentService = contentService;
	}
	
	private String error(String message){
		Writer out = null;
		try {
			response.setContentType("text/html;charset=utf8");
			out = response.getWriter();
			out.write("<script>alert('" + message + "');history.go(-1);</script>");
			out.flush();
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		} finally {
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	private Page getPage(){
		Page pageObj = new Page(page, contentService.getCount(), request.getRequestURL().toString());
		return pageObj;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

}
