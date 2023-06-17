





class HelloWorld
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!"); 
        int n= 9;
        for(int i=0; i<n; i++)
      {
             for(int j=0; j<n; j++)

            {
                if(i+j==4  || j-i==4 || i==2 && j>=2 && j<=6  )
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print(" ");
                }




            }
            
              for(int j=0; j<n; j++)

            {
                if( j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2  || i==(n-1)/2 && j<(n-1)/2  || i==n-1 && j<(n-1)/2 ||
                 j==(n-1)/2 && i>(n-1)/2 && i<(n-1)  )
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print(" ");
                }

            }
            
              for(int j=0; j<n; j++)

            {
                if(i==0 && j<(n-1)/2 && j>0 || j==0 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 && j>0   )
                    
                                                                  
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print("  ");
                }
            }

               for(int j=0; j<n; j++)

            {  
                if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2)
                
                    
                                                                  
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print("  ");
                }
            }

            
                for(int j=0; j<n; j++)


            {  
                if(j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 &&   j<=(n-1)/2 || i==(n-1) && j<=(n-1)/2                ) 
                
                
                    
                                                                  
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print("  ");
                }
            }
            
                for(int j=0; j<n; j++)


            {  
                if( j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 &&   j<=(n-1)/2 ) 
                
                
                    
                                                                  
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print("  ");
                }
            }
            
                 for(int j=0; j<n; j++)

            {
                if(j==0 && i>0 && i<(n-1)/2 || i==0 && j>0 && j<=(n-1)/2  || i==(n-1)/2 && j>0 && j<(n-1)/2 || 
                 j==(n-1)/2 && i<(n-1)/2 && i>1 || i==2 && j==3   )
                    
                                                                  
                {
                    System.out.print("* ");

                    
                }
                else
                {
                    System.out.print("  ");
                }
            }

            

             

           System.out.println(); 
          }      
    } 
}



 


   
     
   

   
      
   
 

   
   

