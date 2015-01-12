
public class Spreadsheet {
  
  // private fields
  private Cell[][] cells;
  private static int rows=11;
  private static int columns = 8;
  private static int columnWidth = 12;
  private static int asciiOffset=64; 
  private String border;
  private String borderRow;
  // private methods
  private static int getCol(String location) {
    //TODO
    return (int)location.charAt(0)-asciiOffset;
  }
  private static int getRow(String location) {
    //TODO
    return Integer.parseInt(location.substring(1));
    //this will take the rest of the string after 1
  }
  
  private static String padOrTruncateDisplayString(Cell cell) {
    // truncate string to length - 1 and display >
    String s = cell.getDisplayString();
    if (s.length() > columnWidth) {
      s = s.substring(0, columnWidth - 1) + ">";
    }
    // if length is odd pad end to even length
    if (s.length() % 2 == 1) {
      s += " ";
    }
    // justify pad to center in cell
    while (s.length() < columnWidth) {
      s = " " + s + " ";
    }
    return s;
  }
  
  // constructor
  public Spreadsheet() {
    //TODO
    border="";
    borderRow=border+"";
    cells=new Cell[rows][columns];
    cells[0][0] = new CellString("");
    for(int i=0;i<columnWidth;i++)
    {
      border+="-";
    }
    borderRow=border+"+";
    for(int col=1;col<columns;col++)
    {
      cells[0][col]=new CellString((char)(asciiOffset+col)+"");
      borderRow+=border+"+";
    }
    for(int row=1;row<rows;row++)
    {
      cells[row][0]=new CellString(row+"");
      for(int col=1;col<columns;col++)
      {
        cells[row][col]=new CellString("");
      }
    }
  }
  
  // mutators
  public void setCell(String location, Cell cell) {
    //TODO
    cells[getRow(location)][getCol(location)]= cell;
  }
  
  // accessors
  public Cell getCell(String location) {
    // TODO
    return cells[getRow(location)][getCol(location)];
  }
  
  public void print() {
    // TODO    
    for (int row=0; row<rows; row++)
    {
      for(int col=0; col<columns; col++)
      {
        System.out.print(padOrTruncateDisplayString(cells[row][col]));
        System.out.print("|");
      }
      System.out.println("\n"+borderRow);
    }
  }
}
