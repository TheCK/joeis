package irvine.oeis.a049;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((-1+(1+x)^4)/4)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A049426 Row sums of triangle A049410.
 * @author Georg Fischer
 */
public class A049426 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049426() {
    super(0, "[[0],[-1],[-3],[-3],[-1],[4,1]]", "[1,1,4,16,76,436]", 4);
    setGfType(1);
  }
}
