/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MakeDao;
import dao.VehicleDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pojo.Make;
import pojo.Vehicle;

/**
 *
 * @author yoka
 */
public class Handler {
    MakeDao makeDao=new MakeDao();
    VehicleDao v=new VehicleDao();
   public List<Vehicle> getVehicle()
   {
       List<Vehicle> arr;
       arr= v.findAll(Vehicle.class);
       
     return arr;
           
   }
}
