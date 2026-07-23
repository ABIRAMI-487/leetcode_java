public class Chess
{
    public boolean squareIsWhite(String coordinates) 
    {
       char row=coordinates.charAt(0);
       char column = coordinates.charAt(1);

       int col=0;
       int rownum=0;

       if(row=='a')
         rownum=1;
       if(row=='b')
         rownum=2;
       if(row=='c')
         rownum=3;  
       if(row=='d')
         rownum=4;
       if(row=='e')
         rownum=5;
       if(row=='f')
         rownum=6; 
       if(row=='g')
         rownum=7;
       if(row=='h')
         rownum=8; 
       
       int sum=rownum+column;
       if (sum%2==0)
       {
        return false;
       } 
       else
       {
        return true;
       }         
    }
}