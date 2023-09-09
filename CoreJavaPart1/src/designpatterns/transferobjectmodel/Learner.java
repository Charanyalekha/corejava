package designpatterns.transferobjectmodel;

public class Learner {
   String lName;
   int id;
   String city;
   public Learner(String lName,int id,String city) {
	this.lName=lName;
	this.id=id;
	this.city=city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Learner [id=" + id + ", lName=" + lName + ", city=" + city + "]";
}
   
}
