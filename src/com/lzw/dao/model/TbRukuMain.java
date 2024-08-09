package com.lzw.dao.model;

public class TbRukuMain implements java.io.Serializable{
	private String rkID;
	private String pzs;
	private String je;
	private String Jsr;
	private String rkdate;
	public TbRukuMain() {
		
	}
	public TbRukuMain (String rkID, String pzs,String je,String Jsr,String rkdate) {
		this.rkID = rkID;
		this.pzs = pzs;
		this.je = je;
		this.Jsr = Jsr;
		this.rkdate = rkdate;
	}
	public String getRkID() {
		return rkID;
	}
	public void setRkID(String rkID) {
		this.rkID = rkID;
	}
	public String getPzs() {
		return pzs;
	}
	public void setPzs(String pzs) {
		this.pzs = pzs;
	}
	public String getJe() {
		return je;
	}
	public void setJe(String je) {
		this.je = je;
	}
	public String getJsr() {
		return Jsr;
	}
	public void setJsr(String Jsr) {
		this.Jsr = Jsr;
	}
	public String getRkdate() {
		return rkdate;
	}
	public void setRkdate(String rkdate) {
		this.rkdate = rkdate;
	}
	public String toString() {
		return getRkID();
	}
	public int hashCode() {						//哈希码是一个整数值，用于在哈希表中快速定位对象。这里的逻辑是基于对象的属性来计算一个整数值，这个值可以用于确定对象在哈希表中的存储位置
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result +((rkID == null)?0:rkID.hashCode());
		result = PRIME*result +((pzs == null)?0:pzs.hashCode());
		result = PRIME*result +((je == null)?0:je.hashCode());
		result = PRIME*result +((Jsr == null)?0:Jsr.hashCode());
		result = PRIME*result +((rkdate == null)?0:rkdate.hashCode());
		return result;
	}
	public boolean equals(Object obj) {//重写Object类的equals方法
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbRukuMain other = (TbRukuMain) obj;
		if (rkID == null) {
			if (other.rkID != null)
				return false;
		}else if (!rkID.equals(other.rkID))
			return false;
		if (pzs == null) {
			if (other.pzs != null)
				return false;
		}else if (!pzs.equals(other.pzs))
			return false;
		if (je == null) {
			if (other.je != null)
				return false;
		}else if (!je.equals(other.je))
			return false;
		if (Jsr == null) {
			if (other.Jsr != null)
				return false;
		}else if (!Jsr.equals(other.Jsr))
			return false;
		if (rkdate == null) {
			if (other.rkdate != null)
				return false;
		}else if (!rkdate.equals(other.rkdate))
			return false;
		return true;
	}
	

}
