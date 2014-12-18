// placeholder
public class CellNumeric extends Cell
{
  public CellNumeric()
  {
    super.setValue("");
  }
  public CellNumeric(double in)
  {
    String out=Double.toString(in);
    super.setValue(out);
  }
  public double value()
  {
    return Double.parseDouble(super.getValue());
  }
  public void setValue(double in)
  {
    super.setValue(Double.toString(in));
  }
}
  
