package irvine.oeis.a309;
// Generated by gen_seq4.pl holos [0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1] [1,2,2,7,5,1,7,2,9,3,11,3,6,4,14,5,9,16,6,15,6,10,8,21,21,21,2,28,3,30,3,6,4,33,5,9,35,6,34,6,10,8,40,40,40] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A309554 a(1) = a(6) = 1, a(2) = a(3) = a(8) = 2, a(4) = a(7) = 7, a(5) = 5; a(n) = a(n-a(n-1)) + a(n-a(n-3)) for n &gt; 8.
 * @author Georg Fischer
 */
public class A309554 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309554() {
    super(1, "[0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", "[1,2,2,7,5,1,7,2,9,3,11,3,6,4,14,5,9,16,6,15,6,10,8,21,21,21,2,28,3,30,3,6,4,33,5,9,35,6,34,6,10,8,40,40,40]", 0);
  }
}
