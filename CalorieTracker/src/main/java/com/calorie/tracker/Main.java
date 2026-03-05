/**
* Lead Author(s):
* @author Kevin Plascencia
* 
* Version: 2026-02-19
*/
package com.calorie.tracker;

import com.calorie.tracker.models.Food;
import com.calorie.tracker.services.FoodService;

/**
 * Purpose: The responsibility of Main is to test our code.
 */
public class Main
{
	public static void main(String[] args)
	{
		FoodService test = new FoodService();
		String testBarcode = "0201262233285";
		System.out.println("Searching for barcode: " + testBarcode + "...");
		Food result = test.getFoodByBarcode(testBarcode);
		if(result != null)
		{
			System.out.println("--- FOOD FOUND ---");
			System.out.println("Name: " + result.getName());
			System.out.println("Calories (per 100g): " + result.getCaloriesPer100g());
			System.out.println("Protein: " + result.getProtein());
			System.out.println("Fat: " + result.getProtein());
			System.out.println("Carbs: " + result.getCarbs());
			System.out.println("Calories (per 24g): " + result.getCaloriesForWeight(24));
			System.out.println("Protein (per 24g) " + result.getProteinForWeight(24));
			System.out.println("Fat (per 24g) " + result.getFatForWeight(24));
			System.out.println("Carbs (per 24g) " + result.getCarbsForWeight(24));
		}
		else
		{
			System.out.println("No food found or an error occurred.");
		}
	}
}
