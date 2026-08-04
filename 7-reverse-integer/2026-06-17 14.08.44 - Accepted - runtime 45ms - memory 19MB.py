class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x < 0 else 1
        reversed_n = int(str(abs(x))[::-1])
        reversed_n *= sign
        if reversed_n < -2**31 or reversed_n > 2**31 - 1:
            return 0
        return reversed_n