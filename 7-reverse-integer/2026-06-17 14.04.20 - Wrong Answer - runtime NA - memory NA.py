class Solution:
    def reverse(self, x: int) -> int:
        sign=-1 if x<0 else 1
        reversed_n=int(str(abs(x))[::-1])
        return sign*reversed_n