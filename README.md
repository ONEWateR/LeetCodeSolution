LeetCodeSolution
================

This is the solutions set of the LeetCode Website's problems.

## Some Information
- Language ：Java
- Website url ：http://oj.leetcode.com/
- Why to Do : Everyday Code is interesting

## Notes
- Climbing Stairs
  - 一开始用传统的递归解题，结果TL了。看了下Dscuss，搜索了一下，发现这道居然就是典型的动态规划题，用哈希把子问题的答案记录了就能节省大量的运行时间。
- Linked List Cycle
  - 判断链表是否有环。通过快慢节点可以简单实现。
- Unique Binary Search Trees 
  - 本题参考了 http://cs.lmu.edu/~ray/notes/binarytrees/ 里面的*How Many Binary Trees Are There?*章节。
  - The first few terms:
      - C(0) = 1
      - C(1) = C(0)C(0) = 1
      - C(2) = C(0)C(1) + C(1)C(0) = 2
      - C(3) = C(0)C(2) + C(1)C(1) + C(2)C(0) = 5
      - C(4) = C(0)C(3) + C(1)C(2) + C(2)C(1) + C(3)C(0) = 14
  - 基本思路跟爬楼梯的题目一样。递归并记录之前求解的结果。
- Populating Next Right Pointers in Each Node 
  - 一开始的解题思路是分层遍历连接next，后面觉得这方法无论是空间还是时间都是一个问题。其实真正的难点无非在5->6这里，只需判断*root.next != null* 就差不多了。
