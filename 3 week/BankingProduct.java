public class BankingProduct{

public static void main(String []ar){

BankingProductEnum leaseenum=BankingProductEnum.LEASE;
String code=leaseenum.getCode();
String description=leaseenum.getDescription();

System.out.println("code="+code+"description "+description);

System.out.println("==================");


System.out.println(BankingProductEnum.valueOf("DEPOSITE").getCode());


System.out.println("==================");


BankingProductEnum[] num=BankingProductEnum.values();
System.out.println(num[2].getCode()+" "+num[2].getDescription());








}
}