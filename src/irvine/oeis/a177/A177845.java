package irvine.oeis.a177;
// Generated by gen_seq4.pl holos [0,-8,14,-7,1] [775,8919,34223,133983] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A177845 a(n) = 6*a(n-1)-8*a(n-2)-3 for n &gt; 2; a(0)=775, a(1)=8919, a(2)=34223.
 * @author Georg Fischer
 */
public class A177845 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177845() {
    super(1, "[0,-8,14,-7,1]", "[775,8919,34223,133983]", 0);
  }
}
