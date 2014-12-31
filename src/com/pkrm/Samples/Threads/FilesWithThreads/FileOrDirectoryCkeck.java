package com.pkrm.FileOperations;

import java.io.File;

public class FileOrDirectoryCkeck  {
	final static String path = "D:/Reader";
	static Integer dirCount =0;
	public static void main(String[] args) {
		new Thread(new Runnable() {			
			@Override
			public void run() {
				int count =0;
			getFile(new File("D:/Reader"),Integer.valueOf(0));	
			System.out.println("Directory count :"+dirCount);
				
			}					
		}).start();
		
	}
	private static void getFile(File filepath,Integer count) {		
			File[] fileList=filepath.listFiles();
			for(File file:fileList)
			{
				if(file.isFile())
				{
					count++;
				}
				else if(file.isDirectory())
				{
					dirCount++;
				}
			}
			System.out.println("Files count :"+count);	
	}


}
