
public class StringMatching {
	// A Naive recursive Java program to find minimum number
	// operations to convert str1 to str2
	static int min(int x,int y,int z)	//calculates min cost
    {
        if (x<y && x<z){ 
        	System.out.print("I"); 
        	return x;
        	}
        if (y<x && y<z){ System.out.print("D"); return y;}
        else{ System.out.print("S"); return z;}
    }
 
    static int editDist(String str1 , String str2 , int i ,int j)
    {
    // String 1 empty, so return length of string 2
    if (i == 0) return j;
      
    // String 2 empty, so return length of string 1
    if (j == 0) return i;
      
    // If last characters of two strings are same, no changes
    // need to be made
    if (str1.charAt(i-1) == str2.charAt(j-1)){
	   System.out.print("N");
        return editDist(str1, str2, i-1, j-1);
    }
    // If last characters are not same, consider all three
    // operations on last character of first string, recursively
    // compute minimum cost for all three operations and take
    // minimum of three values.
    return 1 + min ( editDist(str1, str2, i, j-1),    // Insert
                     editDist(str1, str2, i-1, j),   // Delete
                     editDist(str1, str2, i-1, j-1) // Substitute                     
                   );
	    }
	 
	    public static void main(String args[])
	    {
	        String str1 = "leonard skiena";
	        String str2 = "lynard skynard";
	  
	        System.out.println( editDist( str1 , str2 , str1.length(), str2.length()) );
	    }
}
