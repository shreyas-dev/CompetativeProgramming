package dp;
/*
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”
*/
public class LongestCommonSubsequence {
    //shorter and simple logic
  public int longestCommonSubsequence2(String text1, String text2) {
        if(text1.length()==0 || text2.length()==0) return 0;
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    //recusive solution with dp
    public static int Longcommonseq(String s1, String s2, int i, int j, int dp[][]) {
		if (i >= s1.length() || j >= s2.length()) {
			return 0;
		}

		if (s1.charAt(i) == s2.charAt(j)) {
			return 1 + Longcommonseq(s1, s2, i + 1, j + 1, dp);
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int a = Longcommonseq(s1, s2, i + 1, j, dp);
		int b = Longcommonseq(s1, s2, i, j + 1, dp);
		int c = Longcommonseq(s1, s2, i + 1, j + 1, dp);
		dp[i][j] = Math.max(a, Math.max(b, c));
		return dp[i][j];

	}
    
    public static int longestCommonSubsequence(String a,String b){
        int m=a.length()+1;
        int n=b.length()+1;
        int[][] lcs=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0)
                    lcs[i][j]=0;
                else if(b.charAt(j-1)==a.charAt(i-1)){
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                }
                else{
                    lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(lcs[i][j]);
            }
            System.out.println();
        }
        int i=m-1;
        int j=n-1;
//        while(i>0&&j>0){
//            if(lcs[i][j]>lcs[i-1][j]&&lcs[i][j]>lcs[i][j-1]) {
//                System.out.print(a.charAt(i-1));
//                i--;
//                j--;
//            }
//            else if(lcs[i][j]<lcs[i-1][j]){
//                j--;
//            }
//            else if(lcs[i][j]<lcs[i][j-1]){
//                i--;
//            }else{
//                i--;
//                j--;
//            }
//        }
        return lcs[m-1][n-1];
    }
    static int max(int a, int b)
    {
        return (a > b)? a : b;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("AGGTAB","GXTXAYB"));
    }
}
