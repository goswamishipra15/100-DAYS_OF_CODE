//Problem Statement URL: https://leetcode.com/problems/reverse-vowels-of-a-string/
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c == 'E'|| c == 'I'|| c == 'O' || c == 'U')
                st.push(c);
        }
        char l[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if (l[i] == 'a' || l[i] == 'e' || l[i] == 'i' || l[i] == 'o' || l[i] == 'u' || l[i] == 'A' || l[i] == 'E' || l[i] == 'I' || l[i] == 'O' || l[i] == 'U')
            {
                l[i] = st.peek();
                st.pop();
            }
        }
        return String.valueOf(l);
    }
}
