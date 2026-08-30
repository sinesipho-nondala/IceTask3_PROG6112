/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class RunApplication {
    public static void main(String[]args){
        //Create & populate WorkshopModel objects
        WorkshopModel model1 = new WorkshopModel();
        model1.WorkshopName = "Java Fundamentals";
        model1.Bookings = 28;
        WorkshopModel model2 = new WorkshopModel();
        model2.WorkshopName = "Web Programming";
        model2.Bookings = 16;
        WorkshopModel model3 = new WorkshopModel();
        model3.WorkshopName = "Database Design";
        model3.Bookings = 34;
        
        //Create Workshop array - polymorphism
        Workshop[] workshops = {
            new LabWorkshop(model1),
        new OnlineWorkshop(model2),
        new LabWorkshop(model3),
        };
        //Test them out.
        for(Workshop w: workshops){
            System.out.println("Name:" + w.GetWorkshopName());
            System.out.println("Bookings:" + w.GetBookings());
            System.out.println("Mode:" + w.GetWorkshopMode());
            System.out.println("----------------------");
        }
                
    }
    
}
