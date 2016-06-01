/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import controller.Handler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import pojo.Make;
import pojo.Vehicle;

/**
 *
 * @author yoka
 */
@ManagedBean(name="vehicle")
@SessionScoped
public class VehiclesBean implements Serializable{
 ArrayList<String> vehicles;
 Handler handler=new Handler();
 private int id;
 private String name;
 private String licencePlate;
 private int intialOdemeter;
 private int currentOdemeter;
 
 private DataModel<Vehicle> model=new ListDataModel<>(handler.getVehicle());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int getIntialOdemeter() {
        return intialOdemeter;
    }

    public void setIntialOdemeter(int intialOdemeter) {
        this.intialOdemeter = intialOdemeter;
    }

    public int getCurrentOdemeter() {
        return currentOdemeter;
    }

    public void setCurrentOdemeter(int currentOdemeter) {
        this.currentOdemeter = currentOdemeter;
    }

    public ArrayList<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<String> vehicles) {
        this.vehicles = vehicles;
    }

    public DataModel<Vehicle> getModel() {
        return model;
    }

    public void setModel(DataModel<Vehicle> model) {
        this.model = model;
    }

    
    }
    

