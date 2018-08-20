import java.awt.*;
/**
 *  Name: Jiaqi Fan
 *  Student ID: A12584051
 *  CSE ID: cse8bwang
 *  Date: 2/5/2016
 * 
 *  Class Bear that extends Critter class
 *  Creating a lion object and initialize it
 *  for the game board.
 **/

public class Lion extends Critter
{
  private boolean checkForFight = false;
  /* 
   * Name: Constructor  
   * Purpose: initializing a lion object
   * Parameters: none 
   */
  public Lion()
  { 
  }
  /* 
   * Name: getColor  
   * Purpose: set the color for the lion object.
   * Parameters: none
   * Return Type: return color. (the color for the lion is red)
   */
  public Color getColor()
  {
    return Color.RED;
  }
  /* 
   * Name: eat  
   * Purpose:make the lion eat after certain condition
   * Parameters: none
   * Return Type: boolean true or false (depending on the
   * fight stats. if after fight lion can eat else lion will
   * not eat)
   */
  public boolean eat()
  {
    if(checkForFight == true)
    {
      this.checkForFight = false;
      return true;
    }
    else
    {
      return false;
    }
  }
  /* 
   * Name: fight  
   * Purpose: initialize the method of fighting for lion
   * Parameters: String opponent (the name of opponent involved in fighting)
   * Return Type: Attack method (if the opponent if bear use roar to attack
   * else use pounce to attack)
   */
  public Attack fight(String opponent)
  {
    this.checkForFight = true;
    if(opponent.equals("B"))
    {
      return Attack.ROAR;
    }
    else
    {
      return Attack.POUNCE;
    }
  }
  /* 
   * Name: getMove  
   * Purpose: set the direction of lion moves
   * Parameters: none
   * Return Type: return Direction. (moving south 
   * five times and then go wast then go north 
   * then go east moving in a square direction)
   */
  public Direction getMove()
  {
    for(int i = 0; i < 5; i ++)
    {
      return Direction.SOUTH;
    }
    for(int i = 0; i < 5; i ++)
    {
      return Direction.WEST;
    }
    for(int i = 0; i < 5; i ++)
    {
      return Direction.NORTH;
    }
    for(int i = 0; i < 5; i ++)
    {
      return Direction.EAST;
    }
    return Direction.SOUTH;
  }
   /* 
   * Name: toString  
   * Purpose: set the symbol of lion on board
   * Parameters: none
   * Return Type: return string. (the symbol L as lion)
   */
  public String toString()
  {
    return "L";
  }



}