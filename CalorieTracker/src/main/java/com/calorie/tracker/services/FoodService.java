/**
* Lead Author(s):
* @author kevin; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-02-19
*/
package com.calorie.tracker.services;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.calorie.tracker.models.Food;
/**
 * Purpose: The reponsibility of FoodService is ...
 *
 * FoodService is-a ...
 * FoodService is ...
 */

public class FoodService
{
	public Food getFoodByBarcode(String barcode)
	{
		//build the url
		String url = "https://world.openfoodfacts.org/api/v0/product/" + barcode + ".json";
		//open the HttpClient 
		try(CloseableHttpClient client = HttpClients.createDefault())
		{
			//essentially creating our instruction
			HttpGet request = new HttpGet(url);
			
			//sends the request and retrieves the response
			try(CloseableHttpResponse response = client.execute(request))
			{
				int statusCode = response.getStatusLine().getStatusCode();
				if(statusCode == 200)
				{
					System.out.println("Success! Connection Established.");
					//Json parsing
					//convert response into a string
					String jsonResponse = EntityUtils.toString(response.getEntity());
					//turn the string into a JSON object
					JSONObject fullData = new JSONObject(jsonResponse);
					//get the "product" object
					JSONObject product = fullData.getJSONObject("product");
					//Get the "nutriments" object inside product
					JSONObject nutriments = product.getJSONObject("nutriments");
					//pull the specific data using opt double to avoid crashes on possible missing value
					String name = product.optString("product_name", "Unknown Food");
					double cals = nutriments.optDouble("energy-kcal_100g", 0.0);
					double protein = nutriments.optDouble("proteins_100g", 0.0);
					double fat = nutriments.optDouble("fat_100g", 0.0);
					double carbs = nutriments.optDouble("carbohydrates_100g", 0.0);
					//now we can use our constructor to create our food object
					return new Food(name, cals, protein, fat, carbs);
					
					
				}
				else
				{
				System.out.println("Error Could not find product. Status:" + statusCode);	
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		return null;
		
	}
	
}
