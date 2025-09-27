package com.tnsip.constructo;

public class customer {
	private String customername;
	private int customerid;
	private String customeraddress;
	public customer() {
		System.out.println("default constructor");
		
	}
	public customer(String customername,int customerid,String customeraddress){
		this.customername=customername;
		this.customeraddress=customeraddress;
		this.customerid=customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Override
	public String toString() {
		return "customer [customername=" + customername + ", customerid=" + customerid + ", customeraddress="
				+ customeraddress + "]";
	}
	

	
	
	
	

}
