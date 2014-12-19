import java.text.*;
import java.util.*;

public class CellDate extends Cell {
  
  private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
  public CellDate()
  {
    super();
  }
  public CellDate(String in)
  {
    super.setValue(in);
  }
  
  public void setValue(String input) 
  {
    Date date;
    try 
    {
      date = dateFormat.parse(input); 
      input = dateFormat.format(date);
    } 
    catch (ParseException e) 
    {
      input = "";
    }
    super.setValue(input);
  }
  
}
