package mymod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mt;
import yd;
import yn;



public class MyPickaxe
  extends yn
{
  private String texturePath = "mymod:";
  
  public MyPickaxe(int ItemID, yd material, String textureName)
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
