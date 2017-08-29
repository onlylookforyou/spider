package com.gs.spider.model.commons;

/**
 * 爬虫处理结果数据
 * 
 * @author edmond
 *
 */
public class spiderResultData {

	private int id;
	private String __url;
	private String url;
	private String __time;
	private String article_title;
	private String article_content;
	private String article_thumbnail;
	private String article_author;
	private String article_avatar;
	private String article_publish_time;
	private String article_categories;
	private String article_topics;
	private String comments_count;
	private String __pk;
	private int __version;
	private int status;
	private String tableName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String get__url() {
		return __url;
	}

	public void set__url(String __url) {
		this.__url = __url;
	}

	public String get__time() {
		return __time;
	}

	public void set__time(String __time) {
		this.__time = __time;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_content() {
		return article_content;
	}

	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	public String getArticle_thumbnail() {
		return article_thumbnail;
	}

	public void setArticle_thumbnail(String article_thumbnail) {
		this.article_thumbnail = article_thumbnail;
	}

	public String getArticle_author() {
		return article_author;
	}

	public void setArticle_author(String article_author) {
		this.article_author = article_author;
	}

	public String getArticle_avatar() {
		return article_avatar;
	}

	public void setArticle_avatar(String article_avatar) {
		this.article_avatar = article_avatar;
	}

	public String getArticle_publish_time() {
		return article_publish_time;
	}

	public void setArticle_publish_time(String article_publish_time) {
		this.article_publish_time = article_publish_time;
	}

	public String getArticle_categories() {
		return article_categories;
	}

	public void setArticle_categories(String article_categories) {
		this.article_categories = article_categories;
	}

	public String getArticle_topics() {
		return article_topics;
	}

	public void setArticle_topics(String article_topics) {
		this.article_topics = article_topics;
	}

	public String getComments_count() {
		return comments_count;
	}

	public void setComments_count(String comments_count) {
		this.comments_count = comments_count;
	}

	public String get__pk() {
		return __pk;
	}

	public void set__pk(String __pk) {
		this.__pk = __pk;
	}

	public int get__version() {
		return __version;
	}

	public void set__version(int __version) {
		this.__version = __version;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
