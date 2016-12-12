package com.yz.base.user.pojo;
// Generated 2016-7-13 11:07:49 by Hibernate Tools 4.3.1.Final

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

/**
 * BaseUser generated by hbm2java
 */
@Entity
@Table(name = "base_user")
public class BaseUser implements java.io.Serializable {

	private Integer id;
	private Integer version;
	private String userAccount;
	public String userName;
	private String userPassword;
	private String code;
	private Integer status;
	private Integer loginFailurecount;
	public String userPhoto;
	public String userPhone;
	public String userShowing;
	public String userTitle;
	public String userNote;
	public String userSpec;
	public String userQual;
	public String userTech;
	public String userBack;
	public String userOther;
	public String userDesc;
	private Integer sort;
	private Integer likeNum;
	private Integer criticismNum;
	private Integer viewNum;
	private String createdBy;
	private Timestamp createdDate;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;
	private String userLastIp;
	private String userLoginIp;
	private Timestamp userLoginTime;
	private Timestamp userLastTime;
	private Integer type;
	private String roleCodes;
	public BaseUser() {
	}

	public BaseUser(String userAccount, String userName, String userPassword, String code, Integer status,
			Integer loginFailurecount, String userPhoto, String userPhone, String userShowing, String userTitle,
			String userNote, String userSpec, String userQual, String userTech, String userBack, String userOther,
			String userDesc, Integer sort, Integer likeNum, Integer criticismNum, Integer viewNum, String createdBy,
			Timestamp createdDate, String lastUpdatedBy, Timestamp lastUpdatedDate, String userLastIp, String userLoginIp,
			Timestamp userLoginTime, Timestamp userLastTime, Integer type) {
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.code = code;
		this.status = status;
		this.loginFailurecount = loginFailurecount;
		this.userPhoto = userPhoto;
		this.userPhone = userPhone;
		this.userShowing = userShowing;
		this.userTitle = userTitle;
		this.userNote = userNote;
		this.userSpec = userSpec;
		this.userQual = userQual;
		this.userTech = userTech;
		this.userBack = userBack;
		this.userOther = userOther;
		this.userDesc = userDesc;
		this.sort = sort;
		this.likeNum = likeNum;
		this.criticismNum = criticismNum;
		this.viewNum = viewNum;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
		this.userLastIp = userLastIp;
		this.userLoginIp = userLoginIp;
		this.userLoginTime = userLoginTime;
		this.userLastTime = userLastTime;
		this.type = type;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "USER_ACCOUNT", length = 32)
	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	@Column(name = "USER_NAME")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_PASSWORD", length = 64)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "CODE", length = 32)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "LOGIN_FAILURECOUNT")
	public Integer getLoginFailurecount() {
		return this.loginFailurecount;
	}

	public void setLoginFailurecount(Integer loginFailurecount) {
		this.loginFailurecount = loginFailurecount;
	}

	@Column(name = "USER_PHOTO")
	public String getUserPhoto() {
		return this.userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Column(name = "USER_PHONE")
	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Column(name = "USER_SHOWING")
	public String getUserShowing() {
		return this.userShowing;
	}

	public void setUserShowing(String userShowing) {
		this.userShowing = userShowing;
	}

	@Column(name = "USER_TITLE")
	public String getUserTitle() {
		return this.userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	@Column(name = "USER_NOTE")
	public String getUserNote() {
		return this.userNote;
	}

	public void setUserNote(String userNote) {
		this.userNote = userNote;
	}

	@Column(name = "USER_SPEC")
	public String getUserSpec() {
		return this.userSpec;
	}

	public void setUserSpec(String userSpec) {
		this.userSpec = userSpec;
	}

	@Column(name = "USER_QUAL")
	public String getUserQual() {
		return this.userQual;
	}

	public void setUserQual(String userQual) {
		this.userQual = userQual;
	}

	@Column(name = "USER_TECH")
	public String getUserTech() {
		return this.userTech;
	}

	public void setUserTech(String userTech) {
		this.userTech = userTech;
	}

	@Column(name = "USER_BACK")
	public String getUserBack() {
		return this.userBack;
	}

	public void setUserBack(String userBack) {
		this.userBack = userBack;
	}

	@Column(name = "USER_OTHER")
	public String getUserOther() {
		return this.userOther;
	}

	public void setUserOther(String userOther) {
		this.userOther = userOther;
	}

	@Column(name = "USER_DESC")
	public String getUserDesc() {
		return this.userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Column(name = "LIKE_NUM")
	public Integer getLikeNum() {
		return this.likeNum;
	}

	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}

	@Column(name = "CRITICISM_NUM")
	public Integer getCriticismNum() {
		return this.criticismNum;
	}

	public void setCriticismNum(Integer criticismNum) {
		this.criticismNum = criticismNum;
	}

	@Column(name = "VIEW_NUM")
	public Integer getViewNum() {
		return this.viewNum;
	}

	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}

	@Column(name = "CREATED_BY", length = 32)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "LAST_UPDATED_BY", length = 32)
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_DATE", length = 19)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "USER_LAST_IP")
	public String getUserLastIp() {
		return this.userLastIp;
	}

	public void setUserLastIp(String userLastIp) {
		this.userLastIp = userLastIp;
	}

	@Column(name = "USER_LOGIN_IP")
	public String getUserLoginIp() {
		return this.userLoginIp;
	}

	public void setUserLoginIp(String userLoginIp) {
		this.userLoginIp = userLoginIp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "USER_LOGIN_TIME", length = 19)
	public Date getUserLoginTime() {
		return this.userLoginTime;
	}

	public void setUserLoginTime(Timestamp userLoginTime) {
		this.userLoginTime = userLoginTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "USER_LAST_TIME", length = 19)
	public Date getUserLastTime() {
		return this.userLastTime;
	}

	public void setUserLastTime(Timestamp userLastTime) {
		this.userLastTime = userLastTime;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the roleCodes
	 */
	@Transient
	public String getRoleCodes() {
		return roleCodes;
	}

	/**
	 * @param roleCodes the roleCodes to set
	 */
	public void setRoleCodes(String roleCodes) {
		this.roleCodes = roleCodes;
	}

}
