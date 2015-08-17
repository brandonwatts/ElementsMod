package mymod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mt;
import yd;
import zl;




public class MySword
  extends zl
{
  private String texturePath = "mymod:";
  
  public MySword(int ItemID, yd material, String textureName)
  {
    super(ItemID, material);
    b(textureName);
    texturePath += textureName;
  }
  


  @SideOnly(Side.CLIENT)
  public void a(mt iconRegister)
  {
    cz = iconRegister.a(texturePath);
  }
}
