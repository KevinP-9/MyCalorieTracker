/**
* Lead Author(s):
* @author Kevin Plascencia
* Version: 2026-02-19
*/
package com.calorie.tracker;

import com.calorie.tracker.models.Food;
import com.calorie.tracker.services.FoodService;

/**
 * Purpose: The responsibility of main is ...
 *
 * main is-a ...
 * main is a test class
 */
public class Main
{
	public static void main(String[] args)
	{
		FoodService test = new FoodService();
		String testBarcode = "3017620422003";
		System.out.println("Searching for barcode: " + testBarcode + "...");
		Food result = test.getFoodByBarcode(testBarcode);
		if(result != null)
		{
			System.out.println("--- FOOD FOUND ---");
			System.out.println("Name: " + result.getName());
			System.out.println("Calories (per 100g): " + result.getCaloriesPer100G());
			System.out.println("Protein: " + result.getProtein());
			System.out.println("Fat: " + result.getProtein());
			System.out.println("Carbs: " + result.getCarbs());
		}
		else
		{
			System.out.println("No food found or an error occurred.");
		}
	}
}
