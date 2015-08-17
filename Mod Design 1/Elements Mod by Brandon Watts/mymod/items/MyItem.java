package mymod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mt;
import ww;
import yc;



public class MyItem
  extends yc
{
  private String texturePath = "mymod:";
  
  public MyItem(int ItemID, String textureName)
  {
    super(ItemID);
    b(textureName);
    a(ww.l);
    texturePath += textureName;
  }
  


  @SideOnly(Side.CLIENT)
  public void a(mt iconRegister)
  {
    cz = iconRegister.a(texturePath);
  }
}
