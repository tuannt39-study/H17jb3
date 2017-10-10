/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

/**
 *
 * @author LENOVO
 */
public class CircleEx13 extends GeometricObjec{



        private double radius;

        public CircleEx13(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "The circle has radius:" + radius;
        }

        public double getArea() {
            return radius * radius * 3.14;
        }

        public double getPerimeter() {
            return 2 * radius * 3.14;
        }
    }


