
import static java.lang.System.exit; 
  

 public class st { 
  

    private class Node { 
  
        int data; 
        Node link; 
    } 
    
    Node top; 
   
   st() 
    { 
        this.top = null; 
    } 
  
   
    public void push(int x)  
    { 
     
        Node temp = new Node(); 
  
        
        if (temp == null) { 
            System.out.print(" Overflow"); 
            return; 
        } 
  
        
        temp.data = x; 
  
        
        temp.link = top; 
  
        top = temp; 
    } 
  
    
		
   public static void main(String[] args) 
    { 
         
        st obj = new st(); 
     
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        // print Stack elements 
	obj.display();}
 }
  