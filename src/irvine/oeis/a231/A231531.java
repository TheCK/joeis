package irvine.oeis.a231;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: sin(log(1-x))/(x-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A231531 Imaginary part of Product_{k=1..n} (k+I).
 * @author Georg Fischer
 */
public class A231531 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A231531() {
    super(0, "[[0],[2,2,1],[-3,-5,-2],[2,3,1]]", "[0,1,3,10]", 2);
    setGfType(1);
  }
}
