package com.rushikeshk.file;

import java.io.File;

public class DirectoryCon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//give the path of directory 
	File directory = new File("C:\\Users\\rushikesh\\Desktop\\newDirectory");
	File[] contentsOfDirectory=directory.listFiles();
	
	//loop for read each content in specified directory
	for(File object:contentsOfDirectory) {
		
		//print the name of contents in file format 
		if(object.isFile()) {
			System.out.format("File Name : %s%n", object.getName());
		}
		
		//print the name of contents in directory format 
		else if(object.isDirectory()) {
			System.out.format("Directory Name : %s%n", object.getName());
		}
	}
	
	}

}
