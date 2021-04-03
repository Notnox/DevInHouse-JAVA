package br.com.devinhouse.nucleodeproblemas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionB extends ExceptionA {
	
	public static void foo(){
		try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        catch (FileNotFoundException fileNotFoundException)
        {
        	System.out.println("IOException thrown! - " + fileNotFoundException);
        }
	}

}
