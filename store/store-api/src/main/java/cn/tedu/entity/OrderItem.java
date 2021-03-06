package cn.tedu.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7847015878600066075L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.id
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.oid
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Integer oid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.gid
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Long gid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.title
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.image
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private String image;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.price
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Long price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.num
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Integer num;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.created_user
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private String createdUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.created_time
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Date createdTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.modified_user
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private String modifiedUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_order_item.modified_time
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	private Date modifiedTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.id
	 * @return  the value of t_order_item.id
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.id
	 * @param id  the value for t_order_item.id
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.oid
	 * @return  the value of t_order_item.oid
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Integer getOid() {
		return oid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.oid
	 * @param oid  the value for t_order_item.oid
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setOid(Integer oid) {
		this.oid = oid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.gid
	 * @return  the value of t_order_item.gid
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Long getGid() {
		return gid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.gid
	 * @param gid  the value for t_order_item.gid
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setGid(Long gid) {
		this.gid = gid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.title
	 * @return  the value of t_order_item.title
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.title
	 * @param title  the value for t_order_item.title
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.image
	 * @return  the value of t_order_item.image
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.image
	 * @param image  the value for t_order_item.image
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.price
	 * @return  the value of t_order_item.price
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.price
	 * @param price  the value for t_order_item.price
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.num
	 * @return  the value of t_order_item.num
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.num
	 * @param num  the value for t_order_item.num
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.created_user
	 * @return  the value of t_order_item.created_user
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public String getCreatedUser() {
		return createdUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.created_user
	 * @param createdUser  the value for t_order_item.created_user
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.created_time
	 * @return  the value of t_order_item.created_time
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.created_time
	 * @param createdTime  the value for t_order_item.created_time
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.modified_user
	 * @return  the value of t_order_item.modified_user
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public String getModifiedUser() {
		return modifiedUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.modified_user
	 * @param modifiedUser  the value for t_order_item.modified_user
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_order_item.modified_time
	 * @return  the value of t_order_item.modified_time
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public Date getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_order_item.modified_time
	 * @param modifiedTime  the value for t_order_item.modified_time
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", oid=" + oid + ", gid=" + gid + ", title=" + title + ", image=" + image
				+ ", price=" + price + ", num=" + num + ", createdUser=" + createdUser + ", createdTime=" + createdTime
				+ ", modifiedUser=" + modifiedUser + ", modifiedTime=" + modifiedTime + "]";
	}
	
	
}