class Solution:
    def checkDivisibility(self, n: int) -> bool:
        dsum =0
        cur=0
        product =1
        temp = n
        while n>0:
            digit = n%10
            product *=digit
            cur+=digit
            n //=10
        dsum = product +cur
        
        return temp % dsum == 0