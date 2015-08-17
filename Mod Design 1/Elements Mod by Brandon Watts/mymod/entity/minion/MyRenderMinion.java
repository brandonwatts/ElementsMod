package mymod.entity.minion;

import bbo;
import bhe;
import bjo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import nn;

@SideOnly(Side.CLIENT)
public class MyRenderMinion
  extends bhe
{
  private static final bjo MinionTextures = new bjo("mymod:textures/entity/MyMinion.png");
  
  public MyRenderMinion(bbo par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
  }
  
  protected bjo getMinionTextures(MyEntityMinion par1EntityMinion)
  {
    return MinionTextures;
  }
  



  protected bjo a(nn par1Entity)
  {
    return getMinionTextures((MyEntityMinion)par1Entity);
  }
}
