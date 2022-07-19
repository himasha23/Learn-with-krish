abstract class RentVehicle {

	protected double cost;  
    abstract void getcost();
    
    public void calculatePackage(int km){  
        System.out.println(km*cost);  
    }  
}
 