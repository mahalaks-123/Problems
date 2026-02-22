class Solution:
    def minPathSum(self, grid: list[list[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])
        
        # 1. Initialize the first column (can only come from above)
        for i in range(1, rows):
            grid[i][0] += grid[i-1][0]
            
        # 2. Initialize the first row (can only come from the left)
        for j in range(1, cols):
            grid[0][j] += grid[0][j-1]
            
        # 3. Fill the rest of the grid using the recurrence relation
        for i in range(1, rows):
            for j in range(1, cols):
                # Min cost to reach here = current value + min of top or left
                grid[i][j] += min(grid[i-1][j], grid[i][j-1])
                
        # The bottom-right cell contains the final minimum path sum
        return grid[-1][-1]
