public enum BankingProductEnum{
//enum
	LOAN("LN","Loan"),
	LEASE("LE","Lease"),
	DEPOSITE("DE","Deposite");

private String code;private String description;

private BankingProductEnum(String code,String description){this.code=code;this.description=description;}

public void setCode(String code){this.code=code;}
public void setDescription(String description){this.description=description;}

public String getCode(){return code;}
public String getDescription(){return description; }

}