package com.lzw.dao.model;

public class TbJsr implements java.io.Serializable{
	private String id;
	private String name;
	private String sex;
	private String age;
	private String tel;
	private String enable;
	public TbJsr() {
		
	}
	public TbJsr (String id, String name,String sex,String age,String tel,String enable) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.enable = enable;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String toString() {
		return getName();
	}
	public int hashCode() {						//哈希码是一个整数值，用于在哈希表中快速定位对象。这里的逻辑是基于对象的属性来计算一个整数值，这个值可以用于确定对象在哈希表中的存储位置
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result +((name == null)?0:name.hashCode());
		result = PRIME*result +((age == null)?0:age.hashCode());
		result = PRIME*result +((id == null)?0:id.hashCode());
		result = PRIME*result +((tel == null)?0:tel.hashCode());
		result = PRIME*result +((enable == null)?0:enable.hashCode());
		result = PRIME*result +((sex == null)?0:sex.hashCode());
		return result;
	}
	public boolean equals(Object obj) {//重写Object类的equals方法
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbJsr other = (TbJsr) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		}else if (!age.equals(other.age))
			return false;
		if (enable == null) {
			if (other.enable != null)
				return false;
		}else if (!enable.equals(other.enable))
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
		if (sex == null) {
			if (other.sex != null)
				return false;
		}else if (!sex.equals(other.sex))
			return false;
		return true;
	}

}
