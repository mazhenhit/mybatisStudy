/**
 * @file_name: MsgInfo.java
 */
package com.zhenma.xmlsqlsessionfactory;

import java.sql.Timestamp;

/**
 * @author: Mz
 * @time: 2016年11月13日-下午9:23:55
 * @Description:
 */
public class MsgInfo {

	private Integer id;
	private String phone;
	private String name;
	private String msg;
	private Timestamp update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Timestamp getUpdateTime() {
		return update_time;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.update_time = updateTime;
	}

	@Override
	public String toString() {
		return "id[" + id + "]; "
				+ "phone[" + phone + "]; "
				+ "name[" + name + "]; " 
				+ "msg[" + msg + "]; " 
				+ "updateTime[" + update_time + "]";
	}

}
