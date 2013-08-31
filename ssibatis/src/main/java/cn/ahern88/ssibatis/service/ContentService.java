package cn.ahern88.ssibatis.service;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.ahern88.ssibatis.commons.Page;
import cn.ahern88.ssibatis.dao.SqlMapContentDao;
import cn.ahern88.ssibatis.entity.Content;

/**
 * Content操作服务层
 * @author ahern88
 * @date 2013-8-25 上午1:00:41
 */
public class ContentService {
	
	private static final Log LOG = LogFactory.getLog(ContentService.class);
	
	private SqlMapContentDao sqlMapContentDao;

	/**
	 * 根据id删除数据
	 * @param id
	 * @return 是否删除成功
	 */
	public boolean deleteById(Integer id){
		if(null == id){
			throw new IllegalArgumentException("id is null");
		}
		LOG.info("delete by id " + id);
		return sqlMapContentDao.deleteContentById("content.deleteContentById", new Content(id));
	}
	
	/**
	 * 插入一条数据
	 * @param content
	 * @return 返回插入数据的id
	 */
	public int insert(Content content){
		if(null == content){
			throw new IllegalArgumentException("content is null");
		}
		LOG.info("insert content " + content);
		return sqlMapContentDao.insertContent("content.insertContent", content);
	}
	
	/**
	 * 根据id查找某条记录
	 * @param id
	 * @return 返回对应记录
	 */
	public Content getContentById(Integer id){
		if(null == id){
			throw new IllegalArgumentException("id is null");
		}
		return sqlMapContentDao.queryContentById("content.queryContentById", new Content(id));
	}
	
	/**
	 * 修改对应某条记录，必须存在对应id
	 * @param content
	 * @return 修改是否成功
	 */
	public boolean updateContent(Content content){
		if(null == content){
			throw new IllegalArgumentException("content is null");
		}
		LOG.info("update content " + content);
		return sqlMapContentDao.updateContent("content.updateContent", content);
	}
	
	/**
	 * 根据limit信息查询分页信息
	 * @param limit
	 * @return 返回列表信息
	 */
	@SuppressWarnings("unchecked")
	public List<Content> getContentsByPage(Page page){
		if(null == page){
			throw new IllegalArgumentException("page is null");
		}
		return sqlMapContentDao.getSqlMapClientTemplate().queryForList("content.queryContentsByPage", page);
	}
	
	/**
	 * 获取信息总数
	 * @return 总条数
	 */
	public int getCount(){
		return (Integer)sqlMapContentDao.getSqlMapClientTemplate().queryForObject("content.count");
	}
	
	public void setSqlMapContentDao(SqlMapContentDao sqlMapContentDao) {
		this.sqlMapContentDao = sqlMapContentDao;
	}
	
}
