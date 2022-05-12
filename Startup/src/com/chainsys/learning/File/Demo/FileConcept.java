package com.chainsys.learning.File.Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileConcept {

	public static void main(String[] args) {
		 FileConcept file= new FileConcept () ;
	     //file.FolderCreate();// folder creation
	     //file.Delete();
	     //file.FileCreate();
	    // file.FileRename();
	     file.SubFolderCreate();
		}
	
    public void FolderCreate() {
		File file = new File("C:\\Users\\rame3119\\Desktop\\raja");
		boolean present = file.exists();// exists naa iruka ilaya soldratha boolean
		System.out.println("Fold present:" + present);

		if (present == false) // folder create pandrathu file.mkdir(); present=
		file.exists();
		System.out.println("Fold present:" + present);
	
	    }
	public void SubFolderCreate() 
	    {
		
		File file = new File("C:\\Users\\rame3119\\Desktop\\raja\\suresh\\Dinesh");
		boolean present = file.exists();// exists naa iruka ilaya soldratha boolean
		System.out.println("Fold present:" + present);


		if (present == false) // folder create pandrathu
		file.mkdirs();
		present = file.exists();
		System.out.println("Fold present:" + present);
	    }
	 public void FileCreate() {// file creation: file epdi create pandrathu

		  File file= new File("C:\\Users\\rame3119\\Desktop\\raja\\test1.txt");
		  boolean Present = file.exists(); 
		  if (Present == false)
	      try  {
			boolean created  = file.createNewFile(); 
		  } catch (IOException e)
		  {
		 
		  e.printStackTrace(); }
          }
	 
	public void Delete() { // delete: file delete pandrathu
	     File file =new File ("C:\\Users\\rame3119\\Desktop\\raja\\test1.txt");
		 boolean present=file.delete() ;
		 System.out.println("file present delete:"+present);
		 
	    }
	public void FileRename() {// file rename: epati pandrathu
		
            File file3 =new File ("C:\\Users\\rame3119\\Desktop\\raja\\test1.txt");
		    try {
			file3.createNewFile();
		    }
		    catch (IOException e) {
			
			e.printStackTrace() ;
		}
		  File newname= new File( "C:\\Users\\rame3119\\Desktop\\raja\\test1.txt") ; 
		    boolean renameSuccess=file3.renameTo(newname) ;
		
		   System.out.println("rename success"+renameSuccess );
		
		   //  file name mattu etuthu pakkalam
		  
		  System.out.println("only file name took:"+newname.getName());  
		  
		  //Listing all File and Folders in a directory: file, folder create panni irukaratha ellam varum  
		  File file4 =new File ("C:\\Users\\rame3119\\Desktop");
		  String [] ListoffFilesFolders=file4.list() ;
		  for(int i=0;i<ListoffFilesFolders.length;i++)
			  System.out.println(ListoffFilesFolders[i]);
		  
		  File file5 =new File ("C:\\Users\\rame3119\\Desktop");
		  File[] fileFolderList=file5.listFiles() ;
		  for(File f :fileFolderList)
			  if(f.isDirectory());
		  System.out.println(6);
		  
		  
		  File file6 =new File("C:\\Users\\rame3119\\Desktop");
		    File[]fileFolderArray=file6.listFiles();
		    for(File f: fileFolderArray){
		    	
		    if(f.isFile())
		    {
		    	String fileName=f.getName();
		    	int lastDot= fileName.lastIndexOf(".");
		    	String extension=fileName.substring(lastDot+1);
		    	if(extension.equals("html"))
		    	System.out.println(fileName+" size:"+f.length());
		     
		    
	}

		     
}
}
}
