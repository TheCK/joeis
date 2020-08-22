package irvine.oeis.a285;
// Generated by gen_seq4.pl holos [[0],[23059204,-32118177,19765032,-7058940,1613472,-244902,24696,-1596,60,-1],[15780868,-20547489,11646888,-3756732,754656,-96726,7728,-352,7],[5157516,-6193088,3173747,-900387,152795,-15515,873,-21],[1058400,-1149493,518011,-124015,16635,-1185,35],[150080,-143070,54210,-10195,950,-35],[15092,-11996,3521,-450,21],[1036,-618,117,-7],[40,-13,1]] [1,38,964,21018,431007,8671656,175065071,3591984289] 0 at 2020-03-14 22:45
// Recurrence: (n-8)*(n-5)*a[n+0]=(7*n^3-117*n^2+618*n-1036)*a[n-1]-(21*n^4-450*n^3+3521*n^2-11996*n+15092)*a[n-2]+5*(7*n^5-190*n^4+2039*n^3-10842*n^2+28614*n-30016)*a[n-3]-(35*n^6-1185*n^5+16635*n^4-124015*n^3+518011*n^2-1149493*n+1058400)*a[n-4]+(n-6)*(21*n^6-747*n^5+11033*n^4-86597*n^3+380805*n^2-888917*n+859586)*a[n-5]-(7*n^8-352*n^7+7728*n^6-96726*n^5+754656*n^4-3756732*n^3+11646888*n^2-20547489*n+15780868)*a[n-6]+(n-7)^8*(n-4)*a[n-7]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A285236 Number of entries in the eighth cycles of all permutations of [n].
 * @author Georg Fischer
 */
public class A285236 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A285236() {
    super(8, "[[0],[23059204,-32118177,19765032,-7058940,1613472,-244902,24696,-1596,60,-1],[15780868,-20547489,11646888,-3756732,754656,-96726,7728,-352,7],[5157516,-6193088,3173747,-900387,152795,-15515,873,-21],[1058400,-1149493,518011,-124015,16635,-1185,35],[150080,-143070,54210,-10195,950,-35],[15092,-11996,3521,-450,21],[1036,-618,117,-7],[40,-13,1]]", "[1,38,964,21018,431007,8671656,175065071,3591984289]", 0);
  }
}
