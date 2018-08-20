import java.awt.*;
/**
 *  Name: Jiaqi Fan
 *  Student ID: A12584051
 *  CSE ID: cse8bwang
 *  Date: 2/5/2016
 * 
 *  Class Bear that extends Critter class
 *  Creating a Bear object and initialize it
 *  for the game board.
 **/

public class Bear extends Critter{

  //making a instant variable for deciding the type of bear.
  private boolean grizzly;
  
  /* 
   * Name: Constructor  
   * Purpose: creating a bear depend on the parameter value
   * Parameters: boolean grizzly (to check if the bear is white ot brown) 
   */
  public Bear(boolean grizzly)
  {
    this.grizzly = grizzly;
  }
  /* 
   * Name: getColor  
   * Purpose: set the color for the bear object.
   * Parameters: none
   * Return Type: return color. (the color for the bear
   * is either brown or white)
   */
  public Color getColor()
  {
    if(this.grizzly == true)
    {
      return new Color(190, 110,50);
    }
    else
    {
      return Color.WHITE;
    }
  }
  /* 
   * Name: eat  
   * Purpose: bear is always eating
   * Parameters: none
   * Return Type: boolean true (because
   * the bear is always eating)
   */
  public boolean eat()
  {
    return true;
  }
  
  /* 
   * Name: fight  
   * Purpose: initialize the method of fighting for bear
   * Parameters: String opponent(name of opponent that involved in fight)
   * Return Type: Attack method (scrath for bear)
   */
  public Attack fight(String opponent)
  {
    return Attack.SCRATCH;
  }
  
  /* 
   * Name: getMove  
   * Purpose: set the direction of bear moves
   * Parameters: none
   * Return Type: return Direction. (moving south then east)
   */
  public Direction getMove()
  {
   boolean gosouth = true;
   if(gosouth == true)
   {
     gosouth = false;
     return Direction.SOUTH;
   }
   else
   {
     gosouth = true;
     return Direction.EAST;
   }
  }
  /* 
   * Name: toString  
   * Purpose: set the symbol of bear on board
   * Parameters: none
   * Return Type: return string. (the symbol B as bear)
   */
  public String toString()
  {
    return "B";
  }

  
}