package irvine.oeis.a234;
// Generated by gen_seq4.pl holos [[0],[-1920,-12032,129024,946176,0,-11010048,-25165824,-16777216],[0,5040,86436,557032,1764735,2941225,2470629,823543]] [1,6,63] 0 at 2020-03-14 22:45
// Recurrence: 7*n*(7*n+4)*(7*n+1)*(7*n+5)*(7*n+2)*(7*n+6)*(7*n+3)*a[n+0]-128*(8*n+3)*(4*n-1)*(8*n+1)*(2*n+1)*(8*n-1)*(4*n+1)*(8*n+5)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A234465 a(n) = 3*binomial(8*n+6,n)/(4*n+3).
 * @author Georg Fischer
 */
public class A234465 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A234465() {
    super(0, "[[0],[-1920,-12032,129024,946176,0,-11010048,-25165824,-16777216],[0,5040,86436,557032,1764735,2941225,2470629,823543]]", "[1,6,63]", 0);
  }
}
