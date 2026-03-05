/**
* Lead Author(s):
* @author Kevin Plascencia

* Version: 2026-03-05
*/
package com.calorie.tracker.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose: The responsibility of DailyLog is to create a daily food log that we can use to track total daily food and macros.
 */
public class DailyLog
{
	private List<LoggedFood> dailyLog;
	private double totalCalories;
	//constructor that creates an empty log
	public DailyLog()
	{
		dailyLog = new ArrayList<LoggedFood>();
	}
	
	//adds food to our daily log inclduing the amount eaten 
	public void addFood(Food food, double weightEaten)
	{
		dailyLog.add(new LoggedFood(food, weightEaten));
	}
	
	//sums up the total calories in our daily log
	public double getTotalCalories()
	{
		for(LoggedFood food: dailyLog)
		{
			totalCalories += food.getCalories();
		}
		return totalCalories;
	}
	
	//what will show up when our dailyLog is printed
	@Override
	public String toString()
	{
	
	}
}
