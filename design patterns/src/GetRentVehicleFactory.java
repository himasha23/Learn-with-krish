
public class GetRentVehicleFactory {
	
	public RentVehicle getRent(String RentType){  
        if(RentType == null){  
         return null;  
        }  
      if(RentType.equalsIgnoreCase("car")) {  
             return new Car();  
           }   
       else if(RentType.equalsIgnoreCase("van")){  
            return new Van();  
        }   
   
  return null;  
}  

}
