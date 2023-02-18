class Solution {
    public String solution(String my_string) {

        StringBuffer words = new StringBuffer(my_string);
        String answer = words.reverse().toString();

        return answer;
    }
}