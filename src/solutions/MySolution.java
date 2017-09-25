package solutions;

public class MySolution implements Solution {
    @Override
    public String reverseString(String word) {
        StringBuilder result = new StringBuilder();
    	for(int i = word.length()-1;i>=0;i--){
			result.append(word.charAt(i));
        }
        return result.toString();
    }

    @Override
    public long factorialize(int number) {
        long result = 1;
		for (int i = 1;number>=i;i++){
			result *= i;
		}
    	return result;
    }

    @Override
    public boolean palindrome(String word) {
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9']+","");
        int counter = word.length();
        for(int i = 0;i<word.length()-1;i++){
	        counter--;
        	if(word.charAt(i)!=word.charAt(counter)){
        		return false;
	        }
        }
    	return true;
    }

    @Override
    public int findLongestWord(String word) {
        String[]words = word.split(" ");
        int longest=words[0].length();
        for(int i = 1;i<words.length;i++){
        	if(words[i].length()>longest){
        		longest = words[i].length();
	        }
        }
    	return longest;
    }

    @Override
    public String titleCase(String word) {
        String result = "";
        String[] words = word.toLowerCase().split(" ");
        for(int i = 0;i<words.length;i++){
        	String chars = words[i];
        	String resultWord="";
        	for(int j = 0;j<chars.length();j++){
        		if(j==0){
        			resultWord+=Character.toUpperCase(chars.charAt(0));
        			continue;
		        }
		        resultWord+=chars.charAt(j);
	        }
	        if(i<words.length-1){
        		result+=resultWord+" ";
        		continue;}
        		result += resultWord;
	        }

    	return result;
    }

    @Override
    public int[] largestOfFour(int[][] numbers) {
        return new int[0];
    }

    @Override
    public boolean confirmEnding(String word, String end) {
	    return word.endsWith(end);
    }

    @Override
    public String repeatStringNumTimes(String word, int counter) {
        StringBuilder returnString = new StringBuilder();
        if(counter <= 0){
        	return "";
        }
        for(int i = 0; i<counter; i++){
        	returnString.append(word);
        }

    	return returnString.toString();
    }

    @Override
    public String truncateString(String word, int counter) {
        return null;
    }

    @Override
    public Object[][] chunkArrayInGroups(Object[] numbers, int counter) {
        return new Object[0][];
    }

    @Override
    public Object[] slasher(Object[] numbers, int counter) {
        return new Object[0];
    }

    @Override
    public Object[] destroyer(Object[] numbers, Object... remove) {
        return new Object[0];
    }

    @Override
    public int getIndexToIns(Object[] numbers, float number) {
        return 0;
    }

    @Override
    public String rot13(String word) {
        return null;
    }
}