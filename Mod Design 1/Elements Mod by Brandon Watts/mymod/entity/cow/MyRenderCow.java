package mymod.entity.cow;

import bbo;
import bhe;
import bjo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import nn;

@SideOnly(Side.CLIENT)
public class MyRenderCow
  extends bhe
{
  private static final bjo cowTextures = new bjo("mymod:textures/entity/MyCow.png");
  
  public MyRenderCow(bbo par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
  }
  
  protected bjo getCowTextures(MyEntityCow par1EntityCow)
  {
    return cowTextures;
  }
  



  protected bjo a(nn par1Entity)
  {
    return getCowTextures((MyEntityCow)par1Entity);
  }
}
