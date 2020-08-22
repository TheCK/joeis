package irvine.oeis.a144;
// Generated by gen_seq4.pl holos [[0],[-6,4],[-7,-9,48],[38,48,-60],[-19,-7,12]] [0,2,14,62] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A144657 a(n) = Sum[Sum[(i+j)!/(i!*j!),{i,1,n}],{j,1,n}].
 * @author Georg Fischer
 */
public class A144657 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A144657() {
    super(0, "[[0],[-6,4],[-7,-9,48],[38,48,-60],[-19,-7,12]]", "[0,2,14,62]", 0);
  }
}
