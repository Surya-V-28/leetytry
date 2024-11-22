
import java.io.File; 
 import java.util.Scanner; 
// Displaying file property 
class FileProperties
{ 
    public static void main(String[] args) { 
        //accept file name or directory name through command line args 
       // String fname =args[0]; 
  
        //pass the filename or directory name to File object 
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a file or directory name");
		String fname  = inp.nextLine();
        File f = new File(fname); 
        String[] filenames;
		File []filenames2;
        //apply File class methods on File object 
        System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists() && f.isDirectory()) 
        { 
	        filenames = f.list();
			filenames2  = f.listFiles();
            System.out.println("Is writeable: "+f.canWrite()); 
            System.out.println("Is readable: "+f.canRead()); 
            System.out.println("Is a directory: "+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
			System.out.println("List of files in the directory..");
			for(int i=0;i<filenames.length;i++){
				System.out.print("File "+(i+1)+": "+ filenames[i].toString());
				System.out.print(" name lenght: "+ filenames[i].length());
				System.out.println(" Size: "+ filenames2[i].length());
				
			}
		} 
    } 
} 
