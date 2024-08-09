package com.lzw.dao.model;

public class TbGysinfo implements java.io.Serializable{
	private String id;
	private String name;
	private String address;
	private String bianma;
	private String tel;
	private String lian;
	private String mail;
	public TbGysinfo() {
		
	}
	public TbGysinfo (String id, String name,String address,String bianma,String tel,String lian,String mail) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.bianma = bianma;
		this.tel = tel;
		this.lian = lian;
		this.mail = mail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBianma() {
		return bianma;
	}
	public void setBianma(String bianma) {
		this.bianma = bianma;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLian() {
		return lian;
	}
	public void setLian(String lian) {
		this.lian = lian;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String toString() {
		return getName();
	}
	public int hashCode() {						//哈希码是一个整数值，用于在哈希表中快速定位对象。这里的逻辑是基于对象的属性来计算一个整数值，这个值可以用于确定对象在哈希表中的存储位置
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result +((name == null)?0:name.hashCode());
		result = PRIME*result +((bianma == null)?0:bianma.hashCode());
		result = PRIME*result +((id == null)?0:id.hashCode());
		result = PRIME*result +((tel == null)?0:tel.hashCode());
		result = PRIME*result +((lian == null)?0:lian.hashCode());
		result = PRIME*result +((mail == null)?0:mail.hashCode());
		result = PRIME*result +((address == null)?0:address.hashCode());
		return result;
	}
	public boolean equals(Object obj) {//重写Object类的equals方法
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbGysinfo other = (TbGysinfo) obj;
		if (bianma == null) {
			if (other.bianma != null)
				return false;
		}else if (!bianma.equals(other.bianma))
			return false;
		if (lian == null) {
			if (other.lian != null)
				return false;
		}else if (!lian.equals(other.lian))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		}else if (!id.equals(other.id))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		}else if (!tel.equals(other.tel))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		}else if (!name.equals(other.name))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		}else if (!mail.equals(other.mail))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		}else if (!address.equals(other.address))
			return false;
		return true;
	}
	
}

