/**
* Lead Author(s):
* @author Kevin Plascencia
*
* Version: 2026-02-19
*/
package com.calorie.tracker.models;

/**
 * Purpose: The responsibility of Food is
 *
 * Food is-a object
 * Food is Data Transfer Object representing nutritional information for a specific object
 */
public class Food
{
	//create our instance variables for our food class
	private String name;
	private double caloriesPer100g;
	private double protein;
	private double fat;
	private double carbs;
	
	public Food(String name, double caloriesPer100g, double protein, double fat, double carbs)
	{
		this.name = name;
		this.caloriesPer100g = caloriesPer100g;
		this.protein = protein;
		this.fat = fat;
		this.carbs = carbs;
	}
	//create our getters and setters for our instance variables
	public String getName()
	{
		return name;
	}
	public double getCaloriesPer100g()
	{
		return caloriesPer100g;
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
	public void setCaloriesPer100G(double caloriesPer100g)
	{
		this.caloriesPer100g = caloriesPer100g;
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
	
	//calculates that macro's value by weight
	private double calculateMacro(double valuePer100g, double weightEaten)
	{
		return (valuePer100g / 100.0) * weightEaten;
	}
	
	//call our helper method for each macro
	public double getCaloriesForWeight(double weight)
	{
		return calculateMacro(this.caloriesPer100g, weight);
	}
	public double getProteinForWeight(double weight)
	{
		return calculateMacro(this.protein, weight);
	}
	public double getFatForWeight(double weight)
	{
		return calculateMacro(this.fat, weight);
	}
	public double getCarbsForWeight(double weight)
	{
		return calculateMacro(this.carbs, weight);
	}
	
}
