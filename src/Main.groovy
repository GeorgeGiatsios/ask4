public class HomeAppliancesStore{
  static String nameCompany = " Lesxi Symmetron";
  static int number = 40;
  static String address = " kantrikh platia sparths" ;
//static int x;
  static void setNameCompany(int a){
    nameCompany = String.valueOf(a);
  }
  static void setAddress(int b){
    nameCompany = String.valueOf(b);
  }
  static void setNumber(int x){
    number=x;
  }
  public static void main(String[] args){
    if(nameCompany == null)
    {
      System.out.println("ERROR");
    }
    else{
      System.out.println("The name of the company is" + nameCompany);
    }
    if (address ==null)
    {
      System.out.println("ERROR");
    }
    else{
      System.out.println("The address of the company is" + address);
    }
    if (number == 0)
    {
      System.out.println("ERROR");
    }
    else{
      System.out.println("The number of the company is" + number);
    }
  }
}