package irvine.oeis.a277;
// Generated by gen_seq4.pl holos [[0],[0,32,136,0,-120,-48],[16,60,8,-147,-147,-42],[-8,-20,-2,33,27,6]] [1,7,43] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A277188 The binomial sum a(n) = Sum_{k=0..n}(binomial(n,k)*binomial(n+1,k+1)*binomial(n+2,k+2)).
 * @author Georg Fischer
 */
public class A277188 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277188() {
    super(0, "[[0],[0,32,136,0,-120,-48],[16,60,8,-147,-147,-42],[-8,-20,-2,33,27,6]]", "[1,7,43]", 0);
  }
}
