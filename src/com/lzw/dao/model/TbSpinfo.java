package com.lzw.dao.model;

public class TbSpinfo implements java.io.Serializable{
	private String id;
	private String spname;
	private String cd;
	private String xh;
	private String memo;
	private String gysname;
	public TbSpinfo() {
		
	}
	public TbSpinfo (String id, String spname,String cd,String xh,String memo,String gysname) {
		this.id = id;
		this.spname = spname;
		this.cd = cd;
		this.xh = xh;
		this.memo = memo;
		this.gysname = gysname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
	public String toString() {
		return getSpname();
	}
	public int hashCode() {						//哈希码是一个整数值，用于在哈希表中快速定位对象。这里的逻辑是基于对象的属性来计算一个整数值，这个值可以用于确定对象在哈希表中的存储位置
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result +((cd == null)?0:cd.hashCode());
		result = PRIME*result +((gysname == null)?0:gysname.hashCode());
		result = PRIME*result +((id == null)?0:id.hashCode());
		result = PRIME*result +((memo == null)?0:memo.hashCode());
		result = PRIME*result +((spname == null)?0:spname.hashCode());
		return result;
	}
	public boolean equals(Object obj) {//重写Object类的equals方法
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbSpinfo other = (TbSpinfo) obj;
		if (cd == null) {
			if (other.cd != null)
				return false;
		}else if (!cd.equals(other.cd))
			return false;
		if (gysname == null) {
			if (other.gysname != null)
				return false;
		}else if (!gysname.equals(other.gysname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		}else if (!id.equals(other.id))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		}else if (!memo.equals(other.memo))
			return false;
		if (spname == null) {
			if (other.spname != null)
				return false;
		}else if (!spname.equals(other.spname))
			return false;
		return true;
	}
	
}
