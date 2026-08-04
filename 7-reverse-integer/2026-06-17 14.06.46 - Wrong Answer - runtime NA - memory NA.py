class Solution:
    def reverse(self, x: int) -> int:
        sign=-1 if x<0 else 1
        reversed_n=int(str(abs(x))[::-1])
        if reversed_n>2**31//10 or reversed_n<-2**31//10:
            return 0
        return sign*reversed_n