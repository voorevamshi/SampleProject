public class User{
private int userId;
private String userName;
private byte age;

  public void setUserId(int UserId){
    this.userId=userId
  }
  public int getUserId(){
  retrun userId
  }
 public void setUserName(String userName){
 this.userName=userName
 }
 public String getUserName(){
 return userName}

  //comments
public static void main(String[] arg){
  User u1=new User();
  u1.setUserName("Vamshi");
System.out.println("My name is: "+u1.getUserName());
}
}

