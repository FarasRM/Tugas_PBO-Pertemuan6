/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_6;

/**
 *
 * @author acer
 */


public class TestCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare and allocate a new instance of cylinder
		 // with default color, radius, and height
		 Cylinder c1 = new Cylinder();
		 System.out.println(c1.toString());
		 
		 // Declare and allocate a new instance of cylinder
		 // specifying height, with default color and radius
		 Cylinder c2 = new Cylinder(10.0);
		 System.out.println("Cylinder:"
		 + " radius=" + c2.getRadius()
		 + " height=" + c2.getHeight()
		 + " base area=" + c2.getArea()
		 + " volume=" + c2.getVolume());
		 
		 // Declare and allocate a new instance of cylinder
		 // specifying radius and height, with default color
		 Cylinder c3 = new Cylinder(2.0, 10.0);
		 System.out.println("Cylinder:"
		 + " radius=" + c3.getRadius()
		 + " height=" + c3.getHeight()
		 + " base area=" + c3.getArea()
		 + " volume=" + c3.getVolume());
	}

}
