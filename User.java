public class User{
private int userId;
private String userName;
private byte age;


 public void setUserName(String userName){
 this.userName=userName;
 }
 public String getUserName(){
 return userName;}

  
public static void main(String[] arg){
  User u1=new User();
  u1.setUserName("Vamshi");
System.out.println("My name is: "+u1.getUserName());
}
}
