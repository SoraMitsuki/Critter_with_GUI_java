import java.util.Random;
import java.awt.*;
/**
 *  Name: Jiaqi Fan
 *  Student ID: A12584051
 *  CSE ID: cse8bwang
 *  Date: 2/5/2016
 * 
 *  Class tiger that extends Critter class
 *  Creating a tiger object and initialize it
 *  for the game board.
 **/
  
public class Tiger extends Critter
{
  private int MaxFood;
  
  /* 
   * Name: Constructor  
   * Purpose: initialize a tiger depend on the parameter value
   * Parameters: int hunger (hunger is the number that tiger
   * can eat for the entire life) 
   */
  public Tiger(int hunger)
  {
    this.MaxFood = hunger;
  }
  /* 
   * Name: getColor  
   * Purpose: set the color for the tiger object.
   * Parameters: none
   * Return Type: return color. (the color for the lion is yellow)
   */
  public Color getColor()
  {
    return Color.YELLOW;
  }
  /* 
   * Name: eat  
   * Purpose:set the number of eat avaliable for tiger
   * Parameters: none
   * Return Type: boolean true or false (depending on the
   * number that tiger can eat left, if number of can eat is 0
   * then return false else true)
   */
  public boolean eat()
  {
    if(this.MaxFood > 0)
    {
      this.MaxFood--;
      return true;
    }
    else
    {
      return false;
    }
  }
    /* 
   * Name: fight  
   * Purpose: initialize the method of fighting for tier
   * Parameters: String opponent (the name of opponent involved in fighting)
   * Return Type: Attack method (depend on the hunger state of tiger
   * if not hungry use scratch, else use pounce)
   */
  public Attack fight(String opponent)
  {
    if(this.MaxFood > 0)
    {
      return Attack.SCRATCH;
    }
    else
    {
      return Attack.POUNCE;
    }
  }
  /* 
   * Name: getMove  
   * Purpose: set the direction of tiger moves
   * Parameters: none
   * Return Type: return Direction. (moving randomly to each
   * directions 3 times in a row)
   */
  public Direction getMove()
  {
    Random fourDirections = new Random();
    int checkDirection = fourDirections.nextInt(4);
    if(checkDirection == 0)
    {
      for(int i = 0; i < 3; i++)
      {
        return Direction.NORTH;
      }
     }
     else if(checkDirection == 1)
    {
      for(int i = 0; i < 3; i++)
      {
        return Direction.SOUTH;
      }
     }
      else if(checkDirection == 2)
    {
      for(int i = 0; i < 3; i++)
      {
        return Direction.WEST;
      }
     }
      else
      {
      for(int i = 0; i < 3; i++)
      {
        return Direction.EAST;
      }
      }
     return Direction.NORTH;
  }
  
  /* 
   * Name: toString  
   * Purpose: tiger showed as number on board
   * Parameters: none
   * Return Type: return string. (those number stand
   * for the avaliable number of eat can be called for tiger)
   */
  public String toString()
  {
    return ""+ this.MaxFood;
  }

}