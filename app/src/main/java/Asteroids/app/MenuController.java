package Asteroids.app;

public class MenuController {
   private MenuModel menuModel;
   private MenuView menuView;

   public MenuController(MenuModel mM,MenuView mV){
      this.menuModel = mM;
      this.menuView = mV;
   }
}
