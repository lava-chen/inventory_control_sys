package com.lzw.dao.model;

public class TbRukuDetail implements java.io.Serializable{
	private String id;
	private String rkID;
	private String spid;
	private float dj;
	private float sl;
	public TbRukuDetail() {
		
	}
	public TbRukuDetail(String id, String rkID,String spid,float dj,float sl ) {
		this.id = id;
		this.rkID = rkID;
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
	public String getRkID() {
		return rkID;
	}
	public void setRkID(String rkID) {
		this.rkID = rkID;
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
	public int hashCode() {
		final int P = 31;
		int res = 1;
		res = P*res +((id == null)?0:id.hashCode());
		res = P*res +((rkID == null)?0:rkID.hashCode());
		res = P*res +((spid == null)?0:spid.hashCode());
		return res;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbRukuDetail other = (TbRukuDetail) obj;
		if (rkID == null) {
			if (other.rkID != null)
				return false;
		}else if (!rkID.equals(other.rkID))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		}else if (!id.equals(other.id))
			return false;
		if (spid == null) {
			if (other.spid != null)
				return false;
		}else if (!spid.equals(other.spid))
			return false;
		return true;
	}
}
