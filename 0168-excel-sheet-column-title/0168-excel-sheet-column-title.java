class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder c = new StringBuilder();

        while(columnNumber > 26) {
            columnNumber--;
            c.append( (char) ('A' + (columnNumber % 26)) );
            columnNumber /= 26;
        }

        c.append( (char) ('A' + (columnNumber-1)) );

        return c.reverse().toString();
    }
}