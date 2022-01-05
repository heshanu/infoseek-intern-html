public class BankMain{

public static void main(String [] ar){

	Bank boc=new Bank(1,"fdf","hikka","dfdfd",'A');
	Bank com=new Bank(1,"commercial","hikka","ddddd",'A');
	Bank st=new Bank('A');

	System.out.println(boc.getBankId());
	System.out.println(boc.getBankName());
	System.out.println(boc.getBankAddress());
	System.out.println(boc.getContactNo());
	System.out.println(boc.getStatus());
	System.out.println(boc.saving("com"));

	System.out.println("====================");	

	System.out.println(com.getBankId());
	System.out.println(com.getBankName());
	System.out.println(com.getBankAddress());
	System.out.println(com.getContactNo());
	System.out.println(com.getStatus());
	//com.saving("boc");
	System.out.println(boc.saving("boc"));
	
	System.out.println(st.getStatus());
	
	

	}
}



