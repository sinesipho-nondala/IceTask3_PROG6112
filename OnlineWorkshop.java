/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class OnlineWorkshop extends Workshop {
    public OnlineWorkshop(WorkshopModel model){
        super(model);
    }
    
    @Override
    public String GetWorkshopMode(){
        return"ONLINE";
    }
}
