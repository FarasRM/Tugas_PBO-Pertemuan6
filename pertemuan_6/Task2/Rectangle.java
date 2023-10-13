/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_6.Task2;

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author acer
 */

public abstract class Rectangle implements Shape {
    private double width;
    private double length;
    private String color;
    private boolean filled;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
        this.color = "Default Color";
        this.filled = false;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "Default Color";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public String toString() {
        return "Rectangle[Shape[Color = " + this.color + ", Filled " + this.filled + ", Width " + this.width + ", Length " + this.length + "]";
    }
}

