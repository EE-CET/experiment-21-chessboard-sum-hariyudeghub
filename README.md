# Experiment 21: Chessboard Sum

## Problem Statement

You are given a chessboard of size $N \times N$, where the top left square is **black**. Each square contains a value.
Find the sum of the values of all black squares and all white squares.

**Note:** In a chessboard, black and white squares are alternate.
* If cell `(0,0)` is Black, then `(0,1)` is White, `(0,2)` is Black, `(1,0)` is White, etc.

## Input Format

* The first line contains an integer $N$, the size of a row of the square matrix.
* The next $N$ lines contain $N$ space-separated integers each.

## Output Format

Print two lines:
1. The first line containing the sum of **black** squares.
2. The second line containing the sum of **white** squares.

### Example 1

**Input:**

```text
3
1 2 3
4 5 6
7 8 9
```

**Output:**

```text
25
20
```

**Explanation:**
**Black Squares:**
* (0,0) = 1
* (0,2) = 3
* (1,1) = 5
* (2,0) = 7
* (2,2) = 9
* Sum = $1 + 3 + 5 + 7 + 9 = 25$

**White Squares:**
* (0,1) = 2
* (1,0) = 4
* (1,2) = 6
* (2,1) = 8
* Sum = $2 + 4 + 6 + 8 = 20$
