import java.util.*;
 import java.lang.*;
  import java.io.*;
   /* Name of the class has to be "Main" only if the class is public. */
   	 class Dcoder{ 
   	public static void main (String[] args) throws java.lang.Exception 
   		{ 
   				 Scanner br=new Scanner(System.in); 	
   				  int t=br.nextInt(); 
   				  br.nextLine(); 
   				  nex: while(t--!=0) 
   		{ 
   				  	 String name=br.nextLine(); 
   				  	 		  name=name+" "; 	 int parts=0; 
   				  	 		   for(int i=0;i<name.length();i++) 	
   				  	 		    { 
   				  	 		   	 if(name.charAt(i) ==' ')
   				  	 		   	 parts++;
   				  	 		 	 } 
   				  	 	 String str="",ans=""; 
   				  	 	 for(int i=0;i<name.length();i++)
   				  	 	  {str=""; 
   				  	 	  for(int j=i;j<name.length();j++)
   				  	 	   { 	 char ch=name.charAt(j); 
   				  	 	  	 if(ch==' ') 
   				  	 	  	  { 
   				  	 	  	  	parts--;
   				  	 	  	  	 if(parts==0) 	 {
   				  	 	  	  	 	 ch=str.charAt(0); 
   				  	 	  	  	  ch=Character.toUpperCase(ch);
   				  	 	  	  	   System.out.print(ch); 
   				  	 	  	  	   System.out.print((str.substring(1,str.length())).toLowerCase()+"\n");
   				  	 	  	  	    continue nex; 	 	  } 
   				  	 	  	  	   	 else  { 	 ch=str.charAt(0);  ch=Character.toUpperCase(ch); 
   				  	 	  	  	   	 	 System.out.print(ch+". "); 	 i=j; 	 break; 
   				  	 	  	  	   	 	 	} 	 } 	 else str=str+ch; 
   				  	 	  	  	   	 	 		 } 	 } 	 System.out.println(name.length()); 	 } 
   				  	 	  	  	   	 	 		 
   				  	 	  	  	   	 	 		  	 		} }