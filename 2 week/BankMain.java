public class BankMain{

public static void main(String [] ar){

	Bank boc=new Bank();
	boc.setBankId(1);
	boc.setBankName("bank of ceylon");
	boc.setBankAddress("hikka");
	boc.setContactNo("21121");
	boc.setStatus('A');

	System.out.println(boc.getBankId());
	System.out.println(boc.getBankName());
	System.out.println(boc.getBankAddress());
	System.out.println(boc.getContactNo());
	System.out.println(boc.getStatus());
	System.out.println(boc.saving("com"));

	System.out.println("====================");	
	
	Bank com=new Bank();
	com.setBankId(2);
	com.setBankName("Commericail");
	com.setBankAddress("hikka");
	com.setContactNo("321");
	com.setStatus('A');

	System.out.println(com.getBankId());
	System.out.println(com.getBankName());
	System.out.println(com.getBankAddress());
	System.out.println(com.getContactNo());
	System.out.println(com.getStatus());
	//com.saving("boc");
	System.out.println(boc.saving("boc"));


	}
}



