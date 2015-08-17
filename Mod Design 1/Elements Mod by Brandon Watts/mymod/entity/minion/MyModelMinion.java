package mymod.entity.minion;

import bbo;
import bcu;
import ls;
import nn;
import org.lwjgl.opengl.GL11;

public class MyModelMinion
  extends bbo
{
  bcu body;
  bcu rLeg;
  bcu lLeg;
  bcu rArm;
  bcu lArm;
  
  public MyModelMinion()
  {
    t = 70;
    u = 30;
    
    body = new bcu(this, 18, 0);
    body.a(-3.0F, -4.0F, -3.0F, 8, 8, 8);
    body.a(0.0F, 16.0F, 0.0F);
    body.b(128, 128);
    body.i = true;
    setRotation(body, 0.0F, 0.0F, 0.0F);
    rLeg = new bcu(this, 16, 18);
    rLeg.a(-2.0F, 0.0F, -2.0F, 4, 4, 4);
    rLeg.a(-1.0F, 20.0F, 1.0F);
    rLeg.b(128, 128);
    rLeg.i = true;
    setRotation(rLeg, 0.0F, 0.0F, 0.0F);
    lLeg = new bcu(this, 34, 18);
    lLeg.a(0.0F, 0.0F, 0.0F, 4, 4, 4);
    lLeg.a(1.0F, 20.0F, -1.0F);
    lLeg.b(128, 128);
    lLeg.i = true;
    setRotation(lLeg, 0.0F, 0.0F, 0.0F);
    rArm = new bcu(this, 2, 0);
    rArm.a(-3.0F, -1.0F, -2.0F, 3, 6, 4);
    rArm.a(-3.0F, 15.0F, 1.0F);
    rArm.b(128, 128);
    rArm.i = true;
    setRotation(rArm, 0.0F, 0.0F, 0.0F);
    lArm = new bcu(this, 52, 0);
    lArm.a(0.0F, -1.0F, -2.0F, 3, 6, 4);
    lArm.a(5.0F, 15.0F, 1.0F);
    lArm.b(128, 128);
    lArm.i = true;
    setRotation(lArm, 0.0F, 0.0F, 0.0F);
  }
  

  public void a(nn par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    a(par2, par3, par4, par5, par6, par7, par1Entity);
    
    if (s)
    {
      float f6 = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * par7, 2.0F * par7);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
      GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
      body.a(par7);
      rLeg.a(par7);
      lLeg.a(par7);
      rArm.a(par7);
      lArm.a(par7);
      GL11.glPopMatrix();
    }
    else
    {
      body.a(par7);
      rLeg.a(par7);
      lLeg.a(par7);
      rArm.a(par7);
      lArm.a(par7);
    }
  }
  
  private void setRotation(bcu model, float x, float y, float z)
  {
    f = x;
    g = y;
    h = z;
  }
  
  public void a(float par1, float par2, float par3, float par4, float par5, float par6, nn par7Entity)
  {
    rArm.f = (ls.b(par1 * 0.6662F + 3.1415927F) * 2.0F * par2 * 0.5F);
    lArm.f = (ls.b(par1 * 0.6662F) * 2.0F * par2 * 0.5F);
    rLeg.f = (ls.b(par1 * 0.6662F) * 1.4F * par2);
    lLeg.f = (ls.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
  }
}
