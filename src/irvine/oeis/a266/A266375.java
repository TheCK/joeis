package irvine.oeis.a266;
// Generated by gen_seq4.pl holos [0,1,0,-1,1,0,-2,1] [1,4,10,22,44,84,157,289] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A266375 G.f. = b(2)*b(4)*b(6)/(x^8+x^7-x^3-x^2-x+1), where b(k) = (1-x^k)/(1-x).
 * @author Georg Fischer
 */
public class A266375 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A266375() {
    super(1, "[0,1,0,-1,1,0,-2,1]", "[1,4,10,22,44,84,157,289]", 0);
  }
}
