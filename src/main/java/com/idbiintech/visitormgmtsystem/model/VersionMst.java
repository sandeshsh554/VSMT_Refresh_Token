package com.idbiintech.visitormgmtsystem.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="mst_ver_dtls")
public class VersionMst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="androidvercode")
	private String androidvercode;
	
	@Column(name="androidvername")
	private String androidvername;
	
	@Column(name="androidlink")
	private String androidlink;
	
	@Column(name="androidreldate")
	private String androidreldate;
	
	@Column(name="iosvercode")
	private String iosvercode;
	
	
	
	@Column(name="iosvername")
	private String iosvername;
	
	@Column(name="ioslink")
	private String ioslink;
	
	@Column(name="iosreldate")
	private String iosreldate;
	
	
	@Column(name="deviceos")
	private String deviceos;
	
	
	@Column(name="appname")
	private String appname;


	@Override
	public String toString() {
		return "VersionMst [id=" + id + ", androidvercode=" + androidvercode + ", androidvername=" + androidvername
				+ ", androidlink=" + androidlink + ", androidreldate=" + androidreldate + ", iosvercode=" + iosvercode
				+ ", iosvername=" + iosvername + ", ioslink=" + ioslink + ", iosreldate=" + iosreldate + ", deviceos="
				+ deviceos + ", appname=" + appname + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAndroidvercode() {
		return androidvercode;
	}


	public void setAndroidvercode(String androidvercode) {
		this.androidvercode = androidvercode;
	}


	public String getAndroidvername() {
		return androidvername;
	}


	public void setAndroidvername(String androidvername) {
		this.androidvername = androidvername;
	}


	public String getAndroidlink() {
		return androidlink;
	}


	public void setAndroidlink(String androidlink) {
		this.androidlink = androidlink;
	}


	public String getAndroidreldate() {
		return androidreldate;
	}


	public void setAndroidreldate(String androidreldate) {
		this.androidreldate = androidreldate;
	}


	public String getIosvercode() {
		return iosvercode;
	}


	public void setIosvercode(String iosvercode) {
		this.iosvercode = iosvercode;
	}


	public String getIosvername() {
		return iosvername;
	}


	public void setIosvername(String iosvername) {
		this.iosvername = iosvername;
	}


	public String getIoslink() {
		return ioslink;
	}


	public void setIoslink(String ioslink) {
		this.ioslink = ioslink;
	}


	public String getIosreldate() {
		return iosreldate;
	}


	public void setIosreldate(String iosreldate) {
		this.iosreldate = iosreldate;
	}


	public String getDeviceos() {
		return deviceos;
	}


	public void setDeviceos(String deviceos) {
		this.deviceos = deviceos;
	}


	public String getAppname() {
		return appname;
	}


	public void setAppname(String appname) {
		this.appname = appname;
	}


	@Override
	public int hashCode() {
		return Objects.hash(androidlink, androidreldate, androidvercode, androidvername, appname, deviceos, id, ioslink,
				iosreldate, iosvercode, iosvername);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VersionMst other = (VersionMst) obj;
		return Objects.equals(androidlink, other.androidlink) && Objects.equals(androidreldate, other.androidreldate)
				&& Objects.equals(androidvercode, other.androidvercode)
				&& Objects.equals(androidvername, other.androidvername) && Objects.equals(appname, other.appname)
				&& Objects.equals(deviceos, other.deviceos) && id == other.id && Objects.equals(ioslink, other.ioslink)
				&& Objects.equals(iosreldate, other.iosreldate) && Objects.equals(iosvercode, other.iosvercode)
				&& Objects.equals(iosvername, other.iosvername);
	}
	
	
	
	
	

	 
		
}
