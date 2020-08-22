package irvine.oeis.a158;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(-x^2+16*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A158531 a(n) = Hermite(n,8).
 * @author Georg Fischer
 */
public class A158531 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158531() {
    super(0, "[[0],[2],[-16],[2,1]]", "[1,16,254,4000]", 2);
    setGfType(1);
  }
}
