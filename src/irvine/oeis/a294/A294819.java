package irvine.oeis.a294;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A294819 Number of permutations of [n] avoiding {1324, 2431, 3142}.
 * Recurrence: 2*(n+1)*a(n)+(-19*n+3)*a(n-1)+2*(31*n-39)*a(n-2)+2*(-40*n+93)*a(n-3)+(33*n-107)*a(n-4)+2*(-2*n+9)*a(n-5)=0
 * @author Georg Fischer
 */
public class A294819 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A294819() {
    super(0, "[[0],[-18, 4],[107,-33],[-186, 80],[78,-62],[-3, 19],[-2,-2]]", "1, 1, 2, 6, 21, 76, 275, 989, 3539, 12631, 45066", 0);
  }
}
