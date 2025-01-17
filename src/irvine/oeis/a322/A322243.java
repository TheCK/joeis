package irvine.oeis.a322;
// Generated by gen_seq4.pl holos [[0],[1715,4116,3087,686],[-3423,-5894,-3311,-602],[-815,-1186,-559,-86],[27,36,15,2]] [1,9,289,9801,370881] 3 at 2020-03-14 22:45
// Recurrence: 343*(5+2*n)*(n+1)^2*a[n+0]-7*(3+2*n)*(43*n^2+172*n+163)*a[n+1]-(5+2*n)*(43*n^2+172*n+163)*a[n+2]+(3+2*n)*(n+3)^2*a[n+3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A322243 a(n) = A322242(n)^2, the square of the central coefficient in (1 + 3*x + 4x^2)^n.
 * @author Georg Fischer
 */
public class A322243 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322243() {
    super(0, "[[0],[1715,4116,3087,686],[-3423,-5894,-3311,-602],[-815,-1186,-559,-86],[27,36,15,2]]", "[1,9,289,9801,370881]", 3);
  }
}
