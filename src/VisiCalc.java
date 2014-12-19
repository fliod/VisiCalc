public class VisiCalc{

 public static void main(String[] args) {
  // create an array of cells
   Cell[] cells=new Cell[12];
  
  // initialize the array
   for(int i=0;i<cells.length;i++)
   {
     cells[i]=new CellString("");
   }
  // add test values
   cells[0]=new CellString();
   cells[1]=new CellString("wow");
   cells[2]=new CellString();
   cells[3]=new CellString("wow this is a long string");
   cells[4]=new CellString();
   cells[5]=new CellString();
   cells[6]=new CellNumeric(105.12);
   cells[7]=new CellNumeric(3.14159265359);
   cells[8]=new CellString();
   cells[9]=new CellString();
   cells[10]=new CellDate("01/01/1990");
   cells[11]=new CellDate("12/25/2014");
  // print the array
   for(int i=0;i<cells.length;i++)
   {
     System.out.print(cells[i]+", ");
   }
 }
}
