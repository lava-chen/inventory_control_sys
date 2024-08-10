package com.lzw.dao.model;

public class TbSellDetail implements java.io.Serializable{
	private String id;
	private String sellID;
	private String spid;
	private float dj;
	private float sl;
	public TbSellDetail() {
		
	}
	public TbSellDetail(String id , String sellID,String spid,float dj,float sl) {
		this.id = id;
		this.sellID = sellID;
		this.spid = spid;
		this.dj = dj;
		this.sl = sl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSellID() {
		return sellID;
	}
	public void setSellID(String sellID) {
		this.sellID = sellID;
	}
	public String getSpid() {
		return spid;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}
	public float getDj() {
		return dj;
	}
	public void setDj(float dj) {
		this.dj = dj;
	}
	public float getSl() {
		return sl;
	}
	public void setSl(float sl) {
		this.sl = sl;
	}
	public String toString() {
		return getId();
	}
	public int hashCode() {						//哈希码是一个整数值，用于在哈希表中快速定位对象。这里的逻辑是基于对象的属性来计算一个整数值，这个值可以用于确定对象在哈希表中的存储位置
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result +((id == null)?0:id.hashCode());
		result = PRIME*result +((sellID == null)?0:sellID.hashCode());
		result = PRIME*result +((spid == null)?0:spid.hashCode());
		return result;
	}
	public boolean equals(Object obj) {//重写Object类的equals方法
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbSellDetail other = (TbSellDetail) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}else if (!id.equals(other.id))
			return false;
		if (sellID == null) {
			if (other.sellID != null)
				return false;
		}else if (!sellID.equals(other.sellID))
			return false;
		if (spid == null) {
			if (other.spid != null)
				return false;
		}else if (!spid.equals(other.spid))
			return false;
		return true;
	}
}
