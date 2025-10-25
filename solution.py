class Solution:
    def modifyString(self, s: str) -> str:
        if len(s) == 1:
            if s[0] == "?":
                return "a"
            else:
                return s
        
        let = list(s)
        for i in range(len(let)):
            if let[i] == "?":
                if i != 0 and i != len(let) - 1:
                    a = let[i + 1]
                    b = let[i - 1]
                    c = random.choice(string.ascii_lowercase)

                    while c == a or c == b:
                        c = random.choice(string.ascii_lowercase)
                    
                    let[i] = c
                else:
                    c = random.choice(string.ascii_lowercase)
                    if i == 0:
                        a = let[i + 1]
                        while a == c:
                            c = random.choice(string.ascii_lowercase)

                    else:
                        a = let[i - 1]
                        while a == c:
                            c = random.choice(string.ascii_lowercase)
                    
                    let[i] = c
        
        return("".join(let))
