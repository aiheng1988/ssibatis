package cn.ahern88.ssibatis.commons;

/**
 * 分页工具类，依赖bootstrap
 * @author ahern88
 * @date 2013-8-26 上午1:13:42
 */
public class Page {
	
	private int page; //当前页
	private int pagesize; //每页多少条
	private int totalcount;
	private int begin;
	private String url;
	private static final int SIZE = 5;
	
	public Page(int page, int totalcount, String url){
		this(page, totalcount, url, 5);
	}
	
	public Page(int page, int totalcount, String url, int pagesize){
		this.page = page;
		this.totalcount = totalcount;
		this.url = url;
		this.pagesize = pagesize;
	}
	
	/**
	 * 分页条依赖于bootstrap，格式如下
	 * <div class="pagination pagination-right">
	 *      <ul>
	 *          <li><a href="#">«</a></li>
	 *          <li><a href="#">1</a></li>
	 *          <li><a href="#">»</a></li>
	 *      </ul>
	 * </div>
	 */
	public String page(){
		StringBuffer str = new StringBuffer("<div class=\"pagination pagination-centered\">");
		str.append("<ul>");
		str.append("<li><a href=" + this.getUrl() + "page=1><<</a></li>");
		int b = this.page - SIZE / 2;
		int e = this.page + SIZE / 2;
		if(b < 1){
			b = 1;
			e = (this.getTotalpage() < SIZE) ? this.getTotalpage() : SIZE;
		}
		if(e > this.getTotalpage()){
			b = (this.getTotalpage() > SIZE) ? (this.getTotalpage() - SIZE) : 1;
			e = this.getTotalpage();
		}
		for(int i = b; i <= e; i++){
			if(i == this.page){
				str.append("<li class=\"disabled\">");
			} else {
				str.append("<li>");
			}
			str.append("<a href=\"").append(this.getUrl()).append("page=")
				.append(i).append("\">").append(i).append("</a>");
			str.append("</li>");
		}
		str.append("<li><a href=\"").append(this.getUrl()).append("page=")
			.append(this.getTotalpage()).append("\">>></a></li>");
		str.append("</ul>");
		str.append("</div>");
		return str.toString();
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPagesize() {
		return pagesize;
	}

	public int getTotalpage() {
		if(this.totalcount > 0){
			return this.totalcount % this.pagesize == 0 ? 
					this.totalcount / this.pagesize : 
				(this.totalcount / this.pagesize + 1) ;
		} else {
			return 0;
		}
	}
	
	public int getBegin(){
		if(this.page > 0 && this.page <= this.getTotalpage()){
			this.begin = (this.page - 1) * this.pagesize;
			return begin;
		} else {
			return 0;
		}
	}

	public String getUrl() {
		String url = this.url;
		String[] strs = url.split("\\?");
		if(strs.length > 1){
			url = url + "&";
		} else {
			url = url + "?";
		}
		url = url.replaceAll("page=[0-9]+&", "");
		return url.replaceAll("\\?&", "\\?");
	}

}
