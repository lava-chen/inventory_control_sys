package com.lzw.dao.model;
import java.util.HashSet;
import java.util.Set;

public class TbSellMain implements java.io.Serializable{
    private String sellID;
    private float pzs;
    private float je;
    private String jsr;
    private String datetime;
    private Set tbSellDetails = new HashSet(0);
    public TbSellMain(){
    }
    public TbSellMain(String sellID,float pzs,float je,String jsr,String datetime){
        this.sellID = sellID;
        this.pzs = pzs;
        this.jsr = jsr;
        this.je = je;
        this.datetime = datetime;
    }
    public String getSellID(){
        return sellID;
    }
    public void setSellID(String sellID){
        this.sellID = sellID;
    }
    public float getPzs(){
        return pzs;
    }
    public void setPzs(float pzs){
        this.pzs = pzs;
    }
    public float getJe(){
        return je;
    }
    public void setJe(float je){
        this.je = je;
    }
    public String getJsr(){
        return jsr;
    }
    public void setJsr(String jsr){
        this.jsr = jsr;
    }
    public String getDatetime(){
        return datetime;
    }
    public void setDatetime(String datetime){
        this.datetime = datetime;
    }
    public String toString(){
        return getSellID();
    }
    public Set getTbSellDetails() {
		return this.tbSellDetails;
	}
	public void setTbSellDetails(Set tbSellDetails) {
		this.tbSellDetails = tbSellDetails;
	}
    public int hashCode() {						//哈希码是一个整数值，用于在哈希表中快速定位对象。这里的逻辑是基于对象的属性来计算一个整数值，这个值可以用于确定对象在哈希表中的存储位置
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result +((sellID == null)?0:sellID.hashCode());
		result = PRIME*result +((pzs == null)?0:pzs.hashCode());
		result = PRIME*result +((je == null)?0:je.hashCode());
		result = PRIME*result +((jsr == null)?0:jsr.hashCode());
		result = PRIME*result +((datetime == null)?0:datetime.hashCode());
		return result;
	}
    public boolean equals(Object obj) {//重写Object类的equals方法
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		final TbSellMain other = (TbSellMain) obj;
		if (sellID == null) {
			if (other.sellID != null)
				return false;
		}else if (!sellID.equals(other.sellID))
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
		if (jsr == null) {
			if (other.jsr != null)
				return false;
		}else if (!jsr.equals(other.jsr))
			return false;
		if (datetime == null) {
			if (other.datetime != null)
				return false;
		}else if (!datetime.equals(other.datetime))
			return false;
		return true;
	}
}
