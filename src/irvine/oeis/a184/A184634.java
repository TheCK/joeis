package irvine.oeis.a184;
// Generated by gen_seq4.pl holos [0,1,-3,3,-1,0,-1,3,-3,1] [1,3,11,25,50,86,137,204,291,400,532] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A184634 a(n) = floor(1/{(10+n^4)^(1/4)}), where {}=fractional part.
 * @author Georg Fischer
 */
public class A184634 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A184634() {
    super(1, "[0,1,-3,3,-1,0,-1,3,-3,1]", "[1,3,11,25,50,86,137,204,291,400,532]", 0);
  }
}
