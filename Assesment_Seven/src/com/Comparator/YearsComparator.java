package com.Comparator;

import java.util.Comparator;

public class YearsComparator implements Comparator<Company> {

	

	

	public int compare(Company Obj1, Company Obj2) {
		Company com=(Company) Obj1;
		Company com1=(Company) Obj2;
		if (com.years==com1.years) {
			return 0;	
		}else if(com.years>com1.years) {
			return 1;
		}
		else
		{
			return -1;
				
		}
		
	}

	}


