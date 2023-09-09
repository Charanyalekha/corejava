package designpatterns.transferobjectmodel;

import java.util.ArrayList;

public class LearnerBio {
  ArrayList<Learner> list;
   public LearnerBio() {
	   list=new ArrayList<>();
	   Learner learner1=new Learner("John",1,"Chennai");
	   Learner learner2=new Learner("Micheal",2,"Bangalore");
	   Learner learner3=new Learner("Tushar",3,"Hyderabad");
	   list.add(learner1);
	   list.add(learner2);
	   list.add(learner3);
}
  public void deleteLearner(Learner l) {
	   list.remove(l.getId());
	   System.out.println("Student: Roll No " + ((Learner) l).getId() + ", deleted from database");
	   }
   public ArrayList<Learner> getAllLearners() {
	   return list;
	   }
   public Learner getLearner(int id) {
	   return list.get(id);
	   }
   public void updateLearner(Learner l) {
	   list.get(l.getId()).setlName(l.getlName());
	   System.out.println("Student: Roll No " + l.getId() +", updated in the database");
	   }

}
