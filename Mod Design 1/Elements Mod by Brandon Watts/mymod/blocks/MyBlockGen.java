package mymod.blocks;

import abw;
import ado;
import afq;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;

public class MyBlockGen implements IWorldGenerator
{
  public MyBlockGen() {}
  
  public void generate(Random random, int chunkX, int chunkZ, abw world, ado chunkGenerator, ado chunkProvider)
  {
    switch (t.i)
    {
    case 0: 
      generateSurface(world, random, chunkX * 16, chunkZ * 16);
    }
    
  }
  
  private void generateSurface(abw world, Random random, int BlockX, int BlockZ)
  {
    for (int i = 0; i < 10; i++) {
      int Xcoord = BlockX + random.nextInt(16);
      int Zcoord = BlockZ + random.nextInt(16);
      int Ycoord = random.nextInt(256);
      new afq(MyBlock_1cF, 16).a(world, random, Xcoord, Ycoord, Zcoord);
    }
  }
}
