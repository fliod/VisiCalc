public class VisiCalc {

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
  
  // print the array

 }
}
