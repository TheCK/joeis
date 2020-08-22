package irvine.oeis.a173;
// Generated by gen_seq4.pl holos [[0],[-22500],[382125],[-2721025],[10888525],[-27783210],[48502595],[-60518766],[55523880],[-38152568],[19852652],[-7860674],[2365292],[-536398],[90083],[-10855],[887],[-44],[1]] [80,1847,26040,281571,2580754,21137959,159636030,1134127305,7683664202,50123713793,317076250136,1955475353217,11806000507544,70004699407151,408747986045656,2355077855615435,13413115039118042] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=44*a[n-1]-887*a[n-2]+10855*a[n-3]-90083*a[n-4]+536398*a[n-5]-2365292*a[n-6]+7860674*a[n-7]-19852652*a[n-8]+38152568*a[n-9]-55523880*a[n-10]+60518766*a[n-11]-48502595*a[n-12]+27783210*a[n-13]-10888525*a[n-14]+2721025*a[n-15]-382125*a[n-16]+22500*a[n-17]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A173782 Number of ways to place 4n nonattacking kings on an 8 X 2n chessboard.
 * @author Georg Fischer
 */
public class A173782 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A173782() {
    super(1, "[[0],[-22500],[382125],[-2721025],[10888525],[-27783210],[48502595],[-60518766],[55523880],[-38152568],[19852652],[-7860674],[2365292],[-536398],[90083],[-10855],[887],[-44],[1]]", "[80,1847,26040,281571,2580754,21137959,159636030,1134127305,7683664202,50123713793,317076250136,1955475353217,11806000507544,70004699407151,408747986045656,2355077855615435,13413115039118042]", 0);
  }
}
