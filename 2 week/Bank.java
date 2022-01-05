class Bank{

private int bankId;
private String bankName;
private String bankAddress;
private String contactNo;
private char status;

public Bank(int bankId,String bankName,String bankAddress,String contactNo,char status){
	this.bankId=bankId;
	this.bankName=bankName;
	this.bankAddress=bankAddress;
	this.contactNo=contactNo;
	this.status=status;
}

public Bank(char status){
	this.status=status;
}


public void setBankId(int bankId){
	this.bankId=bankId;
	}

public void setBankAddress(String bankAddress){
	this.bankAddress=bankAddress;
}

public void setBankName(String bankName){
	this.bankName=bankName;
}

public void setContactNo(String contactNo){
	this.contactNo=contactNo;
}

public void setStatus(char status){
	this.status=status;
}

public int getBankId(){
	return bankId;
}

public  String getBankAddress(){
return bankAddress;
}

public String getBankName(){
return bankName;
}

public String getContactNo(){
 return contactNo;
}

public char getStatus(){
	return status;
}

public String lendingMoney(String n){
	return " lending money";
}

public void enableOnlineBanking(){
	System.out.println("enable online banking");
}

public String saving(String n){
	return n+" saving money";
}

public void exchange(){
	System.out.println("exchange money");
}


}