package irvine.oeis.a324;
// Generated by gen_seq4.pl holos [[0],[1],[4],[-12],[-44],[44],[132],[-66],[-132],[44],[44],[-12],[-4],[1]] [0,1,1,64,125,1331,4096,24389,91125,438976,1771561,7880599,32768000] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A324487 a(n) = A001350(n)^3.
 * @author Georg Fischer
 */
public class A324487 extends HolonomicRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A324487() {
    super(1, "[[0],[1],[4],[-12],[-44],[44],[132],[-66],[-132],[44],[44],[-12],[-4],[1]]", "[0,1,1,64,125,1331,4096,24389,91125,438976,1771561,7880599,32768000]", 0);
  }
}
