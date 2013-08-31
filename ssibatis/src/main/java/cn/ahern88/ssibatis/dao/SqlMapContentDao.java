package cn.ahern88.ssibatis.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.ahern88.ssibatis.entity.Content;

/**
 * ibatis操作Content的DAO
 * @author ahern88
 * @date 2013-8-25
 */
public class SqlMapContentDao extends SqlMapClientDaoSupport {
	
	public int insertContent(String statementName, Content content){
		return (Integer)this.getSqlMapClientTemplate().insert(statementName, content);
	}
	
	public Content queryContentById(String statementName, Content content ){
		return (Content)this.getSqlMapClientTemplate().queryForObject(statementName, content);
	}
	
	public boolean deleteContentById(String statementName, Content content ){
		int res = this.getSqlMapClientTemplate().delete(statementName, content);
		return res > 0;
	}
	
	@SuppressWarnings("unchecked")
	public List<Content> queryAllContent(String statementName){
		return this.getSqlMapClientTemplate().queryForList(statementName);
	}
	
	public boolean updateContent(String statementName, Content content ){
		int res = this.getSqlMapClientTemplate().update(statementName, content);
		return res > 0;
	}
	
}