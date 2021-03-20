package com.Comparator;

import java.util.Comparator;

public class CompanyName implements Comparator { 



public int compare(Object a1, Object a2) {
	Company com=(Company) a1;
	Company com1=(Company) a2;
	
	return com.CompanyName.compareTo(com1.CompanyName);
}
}