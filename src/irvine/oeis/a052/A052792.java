package irvine.oeis.a052;
// Generated by gen_seq4.pl holos [[0],[576,1200,840,240,24],[1200,100,-850,-400,-50],[0,-420,175,210,35],[0,40,10,-40,-10],[0,-2,-1,2,1]] [0,0,0,0,0,0,720] 4 at 2020-02-15 22:07
// Recurrence: (1200*n+840*n^2+240*n^3+576+24*n^4)*a[n+0]+(1200-50*n^4+100*n-850*n^2-400*n^3)*a[n+1]+(210*n^3+175*n^2+35*n^4-420*n)*a[n+2]+(10*n^2-40*n^3+40*n-10*n^4)*a[n+3]+(-n^2+n^4-2*n+2*n^3)*a[n+4]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A052792 Expansion of e.g.f.: x^2*(exp(x)-1)^4.
 * @author Georg Fischer
 */
public class A052792 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052792() {
    super(0, "[[0],[576,1200,840,240,24],[1200,100,-850,-400,-50],[0,-420,175,210,35],[0,40,10,-40,-10],[0,-2,-1,2,1]]", "[0,0,0,0,0,0,720]", 4);
  }
}
