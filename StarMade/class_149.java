import org.schema.schine.network.client.ClientState;

final class class_149
  extends class_1404
{
  class_149(class_156 paramclass_156, ClientState paramClientState)
  {
    super(paramClientState);
  }
  
  protected final boolean b3()
  {
    return this.field_89.field_92;
  }
  
  protected final void f()
  {
    if (this.field_89.field_89 == 4)
    {
      ((class_371)a24()).a4().b1("Cannot modify rights\nof admin role");
      return;
    }
    this.field_89.field_92 = false;
  }
  
  protected final void e()
  {
    this.field_89.field_92 = true;
  }
}


/* Location:           C:\Users\Raul\Desktop\StarMadeDec\StarMadeR.zip
 * Qualified Name:     class_149
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */