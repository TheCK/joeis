package irvine.oeis.a133;
// Generated by gen_seq4.pl holos [[0],[-136,68],[-2,-16],[8,-17],[0,4]] [1,3,14,57] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A133444 a(n)=sum{k=0..n, C(n,floor(k/2))*(-1)^k*4^(n-k)}.
 * @author Georg Fischer
 */
public class A133444 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133444() {
    super(0, "[[0],[-136,68],[-2,-16],[8,-17],[0,4]]", "[1,3,14,57]", 0);
  }
}
