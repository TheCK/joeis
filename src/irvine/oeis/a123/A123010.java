package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [0,5,-1,-5,1] [1,0,4,16] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A123010 a(1)=1; a(2)=0; a(3)=4; a(4)=16; a(n)=5a(n-1)+a(n-2)-5a(n-3) for n&gt;=5.
 * @author Georg Fischer
 */
public class A123010 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123010() {
    super(1, "[0,5,-1,-5,1]", "[1,0,4,16]", 0);
  }
}
