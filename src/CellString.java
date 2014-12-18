// placeholder
public class CellString extends Cell
{
  public String toString()
  {
    String result=getValue();
    if(result.length()==0)
    {
      result="<empty>";
    }
    else
    {
      result="\""+result+"\"";
    }
    return result;
  }
  public CellString()
  {
    super.setValue("");
  }
  public CellString(String in)
  {
    super.setValue(in);
  }
  public String value()
  {
    return super.getValue();
  }
  public void setValue(String in)
  {
    super.setValue(in);
  }
}
