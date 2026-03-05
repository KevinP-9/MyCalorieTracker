/**
* Lead Author(s):
* @author Kevin Plascencia
*
* Version: 2026-03-05
*/
package com.calorie.tracker.models;

/**
 * Purpose: The responsibility of LoggedFood is ...
 *
 * LoggedFood is-a ...
 * LoggedFood is ...
 */
public class LoggedFood
{
	private Food food;
	private double weightEaten;
	
	public LoggedFood(Food food, double weight)
	{
		this.food = food;
		weightEaten = weight;
	}
	
	public double getCalories() 
	{
		return food.getCaloriesForWeight(weightEaten);
	}
}
