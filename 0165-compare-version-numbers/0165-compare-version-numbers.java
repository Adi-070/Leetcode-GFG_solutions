class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
       
        while (i < version1.length() || j < version2.length()) {            
            int num1 = 0, num2 = 0;

         
            for (; i < version1.length() && version1.charAt(i) != '.'; i++) {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
            }
              

            for (; j < version2.length() && version2.charAt(j) != '.'; j++) {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
            }
           
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
            i++;
             j++; 
        }

        // If no differences found, the versions are equal
        return 0;
    }
}
// Let's perform a dry run of the updated solution with version1 = "1.1.10" and version2 = "1.1.2".

// Initial Setup:
// i = 0, j = 0
// num1 = 0, num2 = 0
// 1st Iteration of while Loop:
// version1 (i = 0): "1.1.10"
// version2 (j = 0): "1.1.2"
// Parsing version1 (1):
// i = 0, version1.charAt(i) = '1'
// num1 = 0 * 10 + (1 - '0') = 1
// i = 1
// Parsing version2 (1):
// j = 0, version2.charAt(j) = '1'
// num2 = 0 * 10 + (1 - '0') = 1
// j = 1
// Comparison:
// num1 = 1, num2 = 1 → Both are equal.
// Skip dot:

// i++ → i = 2, j++ → j = 2
// 2nd Iteration of while Loop:
// version1 (i = 2): "1.1.10"
// version2 (j = 2): "1.1.2"
// Parsing version1 (1):
// i = 2, version1.charAt(i) = '1'
// num1 = 0 * 10 + (1 - '0') = 1
// i = 3
// Parsing version2 (1):
// j = 2, version2.charAt(j) = '1'
// num2 = 0 * 10 + (1 - '0') = 1
// j = 3
// Comparison:
// num1 = 1, num2 = 1 → Both are equal.
// Skip dot:

// i++ → i = 4, j++ → j = 4
// 3rd Iteration of while Loop:
// version1 (i = 4): "1.1.10"
// version2 (j = 4): "1.1.2"
// Parsing version1 (10):
// i = 4, version1.charAt(i) = '1'
// num1 = 0 * 10 + (1 - '0') = 1
// i = 5
// i = 5, version1.charAt(i) = '0'
// num1 = 1 * 10 + (0 - '0') = 10
// i = 6
// Parsing version2 (2):
// j = 4, version2.charAt(j) = '2'
// num2 = 0 * 10 + (2 - '0') = 2
// j = 5
// Comparison:
// num1 = 10, num2 = 2 → 10 > 2.