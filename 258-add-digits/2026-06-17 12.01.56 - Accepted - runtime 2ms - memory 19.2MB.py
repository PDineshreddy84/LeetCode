class Solution:
    def addDigits(self, num: int) -> int:
        while num>=10:
            n=num
            temp=0
            while n!=0:
                rem=n%10
                temp+=rem
                n//=10
            num=temp
        return num