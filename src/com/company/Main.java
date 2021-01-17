package com.company;

import java.util.Scanner;

public class Main {

    private static Float length;
    private static String len;


    /*
     * little front end to manually confirm the calculations I have created are correct
     * To use run program and enter a length
     * Application will calculate the volume for all three shape types
     */

    public static void main(String[] args) {
        System.out.println("Enter a length to see the volume of three types of shapes");
        System.out.println("1. Sphere: Length = Radius and will give the volume of a Sphere");
        System.out.println("2. Cube: Length = Side and will give the volume of a Cube");
        System.out.println("2. Tetrahedron: Length = Edge and will give the volume of a Tetrahedron");
        Scanner sc = new Scanner(System.in);
        len = sc.next();
        AssignLength();
    }

    public static void AssignLength(){

        System.out.println("************************************************************");
        System.out.println("Enter a length");
        
        try{
            length = Float.parseFloat(len);
            CalculateVolume();
        }
        catch (Exception e){
            System.out.println("Invalid length");
        }
    }

    public static void CalculateVolume(){

        Sphere s1 = new Sphere(length);
        System.out.println("Volume of Sphere = " + s1.getVolume());

        Cube c1 = new Cube(length);
        System.out.println("Volume of Cube = " + c1.getVolume());

        Tetrahedron t1 = new Tetrahedron(length);
        System.out.println("Volume of Tetrahedron = " + t1.getVolume());

        System.out.println("************************************************************");
        }

}
