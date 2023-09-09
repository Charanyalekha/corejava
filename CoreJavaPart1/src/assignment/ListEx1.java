package assignment;

import java.util.ArrayList;
import java.util.List;

class Insect{
	private String insectName;
	private int insectWeight;
	public Insect(String insectName,int insectWeight) {
		this.insectName=insectName;
		this.insectWeight=insectWeight;
	}
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
}
class Insecticides{
	List<String> mapInsectsName(List<Insect> list){
		List<String> list1=new ArrayList<String>();
		for(Insect s:list) {
			list1.add(s.getInsectName());
		}
		return list1;
	}
	List<Insect> getWeight(List<Insect> list){
		List<Insect> list2=new ArrayList<Insect>();
		for(Insect s:list) {
			if(s.getInsectWeight()>40 && s.getInsectWeight()<=100) {
				list2.add(new Insect(s.getInsectName(),s.getInsectWeight()));
			}
		}
		return list2;
	}
}

public class ListEx1 {

	public static void main(String[] args) {
		List<Insect> list=new ArrayList<Insect>();
		list.add(new Insect("Ant",45));
		list.add(new Insect("Cockroach",65));
		list.add(new Insect("Bee",99));
		list.add(new Insect("Paper Wasp",11));
		Insecticides i=new Insecticides();
		System.out.println(i.mapInsectsName(list));
		System.out.println(i.getWeight(list));

	}

}
