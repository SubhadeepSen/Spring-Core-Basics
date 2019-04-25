package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {

	private List<String> myList;
	private Set<Integer> mySet;
	private Map<Integer, String> myMap;

	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<Integer> getMySet() {
		return mySet;
	}
	public void setMySet(Set<Integer> mySet) {
		this.mySet = mySet;
	}
	public Map<Integer, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public void displayList(){
		System.out.println("-----LIST-----");
		for(String list:myList)
			System.out.println(list);
	}
	public void displaySet(){
		System.out.println("-----SET-----");
		for(Integer i:mySet)
			System.out.println(i);
	}
	public void displayMap(){
		System.out.println("-----MAP-----");
		for(Integer key:myMap.keySet())
			System.out.println(key+"--->"+myMap.get(key));
	}
}
