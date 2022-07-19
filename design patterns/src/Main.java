import java.io.*;

class Main {

	 public static void main(String args[])throws IOException{  
		// TODO Auto-generated method stub
		 
		 GetRentVehicleFactory Vehifac = new GetRentVehicleFactory();
		 
		  System.out.print("Enter the vehicle type you want: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      
	      String Type=br.readLine(); 
	      
	      System.out.print("Enter the number of KM: ");  
	      int km=Integer.parseInt(br.readLine());  
	      
	      RentVehicle rent = Vehifac.getRent(Type);  
	      
	      System.out.print("Total Package for "+Type+"  is: ");  
	      rent.getcost();  
	      rent.calculatePackage(km);  

	}

}
