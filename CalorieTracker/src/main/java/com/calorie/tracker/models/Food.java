/**
* Lead Author(s):
* @author Kevin Plascencia
*
* Version: 2026-02-19
*/
package com.calorie.tracker.models;

/**
 * Purpose: The responsibility of Food is t
 *
 * Food is-a object
 * Food is Data Transfer Object representing nutritional information for a specific object
 */
public class Food
{
	//create our instance variables for our food class
	private String name;
	private double caloriesPer100G;
	private double protein;
	private double fat;
	private double carbs;
	
	public Food(String name, double caloriesPer100G, double protein, double fat, double carbs)
	{
		this.name = name;
		this.caloriesPer100G = caloriesPer100G;
		this.protein = protein;
		this.fat = fat;
		this.carbs = carbs;
	}
	//create our getters and setters for our instance variables
	public String getName()
	{
		return name;
	}
	public double getCaloriesPer100G()
	{
		return caloriesPer100G;
	}
	public double getProtein()
	{
		return protein;
	}
	public double getFat()
	{
		return fat;
	}
	public double getCarbs()
	{
		return carbs;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCaloriesPer100G(double caloriesPer100G)
	{
		this.caloriesPer100G = caloriesPer100G;
	}
	public void setProtein(double protein)
	{
		this.protein = protein;
	}
	public void setFat(double fat)
	{
		this.fat = fat;
	}
	public void setCarbs(double carbs)
	{
		this.carbs = carbs;
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		
	}
}
