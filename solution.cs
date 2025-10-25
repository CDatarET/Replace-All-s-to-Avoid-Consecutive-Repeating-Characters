public class Solution {
    public string ModifyString(string s) {
        char[] letters = s.ToCharArray();
        for(int i = 0; i < s.Length; i++){
            if(s[i] == '?'){
                for(char c = 'a'; c <= 'c'; c++){
                    if((i > 0 && letters[i - 1] == c) || (i < letters.Length - 1 && letters[i + 1] == c)){
                        continue;
                    }

                    letters[i] = c;
                    break;
                }
            }
        }

        return(new string(letters));
    }
}
