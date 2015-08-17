package mymod.blocks;

import akc;
import aqz;
import java.util.Random;
import mt;
import ww;

public class MyBlock
  extends aqz
{
  private String texturePath = "mymod:";
  private int thisBlockID;
  
  public MyBlock(int par1, akc blockMaterial, String textureName)
  {
    super(par1, blockMaterial);
    a(ww.b);
    c(textureName);
    texturePath += textureName;
    thisBlockID = par1;
  }
  
  public int a(int par1, Random par2Random, int par3)
  {
    return thisBlockID;
  }
  
  public int a(Random random)
  {
    return 1;
  }
  
  public void a(mt iconRegister)
  {
    cW = iconRegister.a(texturePath);
  }
}
