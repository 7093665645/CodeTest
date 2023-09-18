package LeetCode;

import java.util.HashMap;
import java.util.Map.Entry;

/*Letter Occurrence*/
public class Occurrence {

	public static void main(String[] args) {
		String name = "RavindraReddy";
		testOccurrence(name);
	}
	
	public static void testOccurrence(String input)
	{
		char[] arrayObject = input.toCharArray();
		HashMap<Character, Integer> mapObject = new HashMap<Character, Integer>();
		for(char letter: arrayObject)
		{
			if(mapObject.containsKey(letter))
			{
				mapObject.put(letter, mapObject.get(letter)+1);
			}else
			{
				mapObject.put(letter, 1);
			}
		}
		
		for(Entry<Character, Integer> keys: mapObject.entrySet())
		{
			System.out.println(keys.getKey()+" "+keys.getValue());
		}
	}

}
