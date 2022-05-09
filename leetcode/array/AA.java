package com.san.leetcode.array;

import java.io.*;
import java.util.*;
public class AA {

static int[][] dp = new int[100][100];

static int memoisation(int[] p, int i, int j)
{
	if (i == j)
	{
	return 0;
	}
	if (dp[i][j] != -1)
	{
	return dp[i][j];
	}
	dp[i][j] = Integer.MAX_VALUE;
	for (int k = i; k < j; k++)
	{
	dp[i][j] = Math.min(
		dp[i][j], memoisation(p, i, k)
		+ memoisation(p, k + 1, j)
		+ p[i - 1] * p[k] * p[j]);
	}
	return dp[i][j];
}

static int MatrixChainOrder(int[] p, int n)
{
	int i = 1, j = n - 1;
	return memoisation(p, i, j);
}

public static void main (String[] args)
{

	int P[] = {40, 20, 30, 10, 30};
	int n= P.length;

	for (int[] row : dp)
	Arrays.fill(row, -1);

	System.out.println("Minimum number of multiplication operations is: " + MatrixChainOrder(P, n));
}
}