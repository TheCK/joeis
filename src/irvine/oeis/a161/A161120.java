package irvine.oeis.a161;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (x*(1-x))/(1-2*x)^(3/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A161120 Number of cycles with entries of opposite parities in all fixed-point-free involutions of {1,2,...,2n}.
 * @author Georg Fischer
 */
public class A161120 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A161120() {
    super(0, "[[0],[-1,2],[-2,-3],[1,1]]", "[0,1,4,27]", 2);
    setGfType(1);
  }
}
