/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class LabWorkshop extends Workshop {
    
    //Constructor
    public LabWorkshop(WorkshopModel model){
        super(model);
    }
    
    //Implement an abstract method.
    @Override
    public String GetWorkshopMode(){
        return "LAB";
    }
}
