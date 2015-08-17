package mymod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mt;
import xx;




public class MyFood
  extends xx
{
  private String texturePath = "mymod:";
  
  public MyFood(int itemID, int healAmount, Float saturationModifier, boolean isWolfsFavoriteMeat, String textureName)
  {
    super(itemID, healAmount, saturationModifier.floatValue(), isWolfsFavoriteMeat);
    b(textureName);
    texturePath += textureName;
  }
  

  @SideOnly(Side.CLIENT)
  public void a(mt iconRegister)
  {
    cz = iconRegister.a(texturePath);
  }
}
