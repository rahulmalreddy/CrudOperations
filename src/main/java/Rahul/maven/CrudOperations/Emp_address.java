package Rahul.maven.CrudOperations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name= "Emp_address")
public class Emp_address {
	@Id
	@Column(name= "addid")
    private int addressid;
	private String Streetname;
    private int Plotno;


	private String city;
	
	@Override
	public String toString() {
		return "Emp_address [addressid=" + addressid + ", Streetname=" + Streetname + ", Plotno=" + Plotno + ", city="
				+ city + "]";
	}
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}
	public int getPlotno() {
		return Plotno;
	}
	public Emp_address(int addressid, String streetname, int plotno, String city) {
		super();
		this.addressid = addressid;
		Streetname = streetname;
		Plotno = plotno;
		this.city = city;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public void setPlotno(int plotno) {
		Plotno = plotno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public Emp_address() {
		
	}
}
