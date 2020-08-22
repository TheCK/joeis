package irvine.oeis.a064;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 2-2*log(1-2*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A064378 a(0) = 2, a(n) = 2^(n+1)*(n-1)! (n &gt;= 1).
 * @author Georg Fischer
 */
public class A064378 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064378() {
    super(0, "[[0],[0],[2,2],[-2,-1]]", "[2,4,8,32]", 2);
    setGfType(1);
  }
}
