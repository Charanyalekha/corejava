package designpatterns.transferobjectmodel;

public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		LearnerBio l = new LearnerBio();
		//print all students
		for (Learner learner : l.getAllLearners()) {
		System.out.println(learner);
		}
		Learner learner1 = l.getAllLearners().get(0);
		learner1.setlName("Harry");
		l.updateLearner(learner1);
		//get the student
		learner1 = l.getLearner(0);
		System.out.println(learner1);
	for (Learner learner2 : l.getAllLearners()) {
		System.out.println(learner2);
			}

	}

}
