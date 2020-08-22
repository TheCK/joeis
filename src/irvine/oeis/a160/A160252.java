package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(18*x-841*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160252 Numerator of Hermite(n, 9/29).
 * @author Georg Fischer
 */
public class A160252 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160252() {
    super(0, "[[0],[1682],[-18],[2,1]]", "[1,18,-1358,-84996]", 2);
    setGfType(1);
  }
}
