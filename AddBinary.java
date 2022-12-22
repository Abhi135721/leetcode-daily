class Solution {
    public String addBinary(String a, String b) {
        int i =a.length() - 1, j=b.length() - 1;
        int carry = 0;
        String res = "";
        while(true){
            int abit = i >= 0 ? Integer.parseInt(a.charAt(i) + "") : 0;
            int bbit = j >=0 ? Integer.parseInt(b.charAt(j) + "") : 0;
            int sum = abit + bbit + carry;
            switch(sum){
                case 0:
                    res = "0" + res;
                    carry = 0;
                    break;
                case 1:
                    res = "1" + res;
                    carry = 0;
                    break;
                case 2:
                    res = "0" + res;
                    carry = 1;
                    break;
                case 3:
                    res = "1" + res;
                    carry = 1;
                    break;
            }
            i--; j--;   
            if(i < 0 && j < 0 && carry == 0){
                break;
            } 
        }
        return res;
    }
}