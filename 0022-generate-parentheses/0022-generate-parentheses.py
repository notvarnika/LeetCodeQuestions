class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        def dfs (open, close , s):
            if len(s)== n*2:
                res.append(s)
                return
            if open < n:
                dfs(open+1, close , s+'(')
            if close < open:
                dfs(open, close+1, s+')')
        res = []
        dfs(0,0,'')
        return res