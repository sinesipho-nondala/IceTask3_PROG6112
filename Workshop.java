/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public abstract class Workshop implements IWorkshop {
    //Declaring the private fields.
    private String workshopName;
    private int bookings;
    
    public Workshop(WorkshopModel model){
        //Use the model to set up the private fields
        this.workshopName = model.WorkshopName;
        this.bookings = model.Bookings;
    }
//Implement interface methods
@Override
public String GetWorkshopName(){
    return workshopName;
    
}

@Override
public int GetBookings(){
    return bookings;
}
//the subclasses should implement this.
public abstract String GetWorkshopMode();

}
