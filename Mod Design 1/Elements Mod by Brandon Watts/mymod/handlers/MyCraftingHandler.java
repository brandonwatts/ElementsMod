package mymod.handlers;

import mo;
import mymod.Main;
import uf;
import yc;
import ye;

public class MyCraftingHandler implements cpw.mods.fml.common.ICraftingHandler
{
  public MyCraftingHandler() {}
  
  public void onSmelting(uf player, ye item)
  {
    if (d == MyItem_1cv)
    {
      player.a(Main.MyAchievement_2, 1);
    }
  }
  


  public void onCrafting(uf player, ye item, mo craftMatrix)
  {
    if (d == MySword_1cv)
    {
      player.a(Main.MyAchievement_3, 1);
    }
  }
}
