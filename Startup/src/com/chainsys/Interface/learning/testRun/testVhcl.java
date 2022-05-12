package com.chainsys.Interface.learning.testRun;

import com.chainsys.Interface.learning.test.IVehicle;
import com.chainsys.Interface.learning.test.VehicleCar;
import com.chainsys.Interface.learning.test.VehicleShip;

public class testVhcl {
    public static void main(String args[]) {
        testVehicle();
    }
    public static void testVehicle()
    {
        IVehicle v1;//=new IVehicle();
        v1=new VehicleCar();
        v1.echo();
        v1.start();
        v1.stop();
        //v1.park();
        // type cast the Object to the Car class
        VehicleCar c1=(VehicleCar) v1;            
        c1.park();
        v1 = new VehicleShip();
        v1.echo();
        v1.start();
        v1.stop();
    }
}