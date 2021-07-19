package Constructor;

import java.util.Scanner;

public class Travel {
	 
	String dest; 
	int charge; 
	String mode;
	int num;
	
	
	
	 
	void Destination()
	
	{  
		Scanner sc =new Scanner(System.in);
		System.out.println("Select the destination\n.Goa\n2.delhi\n3manali");
       int n=sc.nextInt();
		if(n==1) {
			dest="Goa";
		}
		else if(n==2) {
			dest="delhi";
		}
		else {
			dest="manali";
		}
	 
	 
}  
	 
 void ModeOfTransport(){  
	
	Scanner ss =new Scanner(System.in);
	System.out.println("Select the dtransportation\n.train\n2.flight\n3 Taxi");
	int n=ss.nextInt();
	if(dest=="Goa") {
		if(n==1) {
			mode="Train";
			charge=10000;
			}
	
	else if(n==2) {
		mode="flight";
		charge=10000;
	}
	else {
		mode="Taxi";
		charge=20000;
	}
	}
	if(dest=="delhi") {
		if(n==1) {
			mode="Train";
			charge=10000;
			}
	
	else if(n==2) {
		mode="flight";
		charge=30000;
	}
	else {
		mode="Taxi";
		charge=20000;
	}
	}
	if(dest=="manali") {
		if(n==1) {
			mode="Train";
			charge=1000;
			}
	
	else if(n==2) {
		mode="flight";
		charge=30000;
	}
	else {
		mode="Taxi";
		charge=40000;
	
}
}
 }
	void NoOfPersons() {
		Scanner sn=new Scanner(System.in);
		System.out.println("Input number of person");
       int a=sn.nextInt();
		num=a;
	}
	  void TotalCharge() {
		  int total;
		  total=num*charge;
	  

	
	
	System.out.println("Destination: "+ dest);
	System.out.println("Mode of transport: "+mode);
	System.out.println("Number of Passengers: "+num);
	
	System.out.println("Total Expense: "+total);
	
	
	}

	
}

