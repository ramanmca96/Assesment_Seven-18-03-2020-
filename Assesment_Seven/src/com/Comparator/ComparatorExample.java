package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample 
{
public static void main(String[] args) {
	ArrayList<Company>list=new ArrayList<Company>();
	list.add(new Company(2, "VeeTech", "VeeInnovative", 1996));
	list.add(new Company(10, "SonaGroups", "Hiremee", 2010));
	list.add(new Company(7, "Zee", "VeeKnow", 2020));
	
	System.out.println("Sorting By Names:");
	Collections.sort(list,new CompanyName());
	for (Company company : list) {
		System.out.println(company.comId+" "+company.CompanyName+" "+company.ProjectName+" "+company.years);
	}
	
	System.out.println("Sorting By Years:");
	Collections.sort(list,new YearsComparator());
	for (Company company : list) {
		System.out.println(company.comId+" "+company.CompanyName+" "+company.ProjectName+" "+company.years);
	}
	
}
}
