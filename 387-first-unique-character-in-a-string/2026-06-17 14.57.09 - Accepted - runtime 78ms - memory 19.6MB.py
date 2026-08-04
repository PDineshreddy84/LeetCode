class Solution:
    def firstUniqChar(self, s: str) -> int:
        d={}
        for ch in s:
            d[ch]=d.get(ch,0)+1
        i=0
        for ch in s:
            if d.get(ch)==1:
                return i
            i+=1
        return -1