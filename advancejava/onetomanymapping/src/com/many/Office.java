package com.many;

public class Office {
	private int oid;
	private String oname;
//	private int fkid;
	private Vendor v;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	/*public int getFkid() {
		return fkid;
	}
	public void setFkid(int fkid) {
		this.fkid = fkid;
	}
	*/
	public Vendor getV() {
		return v;
	}
	public void setV(Vendor v) {
		this.v = v;
	}
}
