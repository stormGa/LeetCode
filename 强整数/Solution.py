from typing import List
class Solution:
    def powerfulIntegers(self, x: int, y: int, bound: int) -> List[int]:
        ans = set()
        a = 1
        while a<=bound:
            b = 1
            while a+b <=bound:
                ans.add(a+b)
                b = b*y
                if y == 1:
                    break
            if x == 1:
                break
            a = a*x
        return list(ans)

ans = Solution().powerfulIntegers(2,3,10)
print(ans)

