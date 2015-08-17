package mymod.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mt;
import nn;
import wh;
import wj;
import ww;
import ye;

public class MyArmor extends wh
{
  private String texturePath = "mymod:textures/armor/";
  private String iconPath = "mymod:";
  
  public MyArmor(int par1, wj par2EnumArmorMaterial, int par3, int par4, String myArmorName) {
    super(par1, par2EnumArmorMaterial, par3, par4);
    d(1);
    a(ww.j);
    SetArmorType(myArmorName, par4);
  }
  

  private void SetArmorType(String myArmorName, int par4)
  {
    switch (par4)
    {
    case 0: 
      b("MyHelmet_1");
      texturePath = (texturePath + myArmorName + "_1.png");
      iconPath += "MyHelmet_1";
      break;
    case 1: 
      b("MyChest_1");
      texturePath = (texturePath + myArmorName + "_1.png");
      iconPath += "MyChest_1";
      break;
    case 2: 
      b("MyLeggings_1");
      texturePath = (texturePath + myArmorName + "_2.png");
      iconPath += "MyLeggings_1";
      break;
    case 3: 
      b("MyBoots_1");
      texturePath = (texturePath + myArmorName + "_1.png");
      iconPath += "MyBoots_1";
    }
    
  }
  
  @SideOnly(Side.CLIENT)
  public void a(mt reg)
  {
    cz = reg.a(iconPath);
  }
  
  public String getArmorTexture(ye stack, nn entity, int layer, int slot)
  {
    return texturePath;
  }
}
