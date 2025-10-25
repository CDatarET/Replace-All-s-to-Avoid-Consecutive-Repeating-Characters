class Solution {
    public String modifyString(String s) {
        if(s.length() == 1){
            if(s.charAt(0) == '?'){
                return("a");
            }
            return(s);
        }

        Random r = new Random();
        char[] letters = s.toCharArray();
        for(int i = 0; i < letters.length; i++){
            if(letters[i] == '?'){
                if(i != 0 && i != letters.length - 1){
                    char a = letters[i - 1];
                    char b = letters[i + 1];
                    char c = (char)('a' + r.nextInt(26));

                    while(c == a || c == b){
                        c = (char)('a' + r.nextInt(26));
                    }

                    letters[i] = c;
                }
                else{
                    char c = (char)('a' + r.nextInt(26));
                    if(i == 0){
                        char a = letters[i + 1];
                        while(c == a){
                            c = (char)('a' + r.nextInt(26));
                        }
                    }
                    else{
                        char a = letters[i - 1];
                        while(c == a){
                            c = (char)('a' + r.nextInt(26));
                        }
                    }

                    letters[i] = c;
                }
            }
        }
        return(new String(letters));
    }
}
