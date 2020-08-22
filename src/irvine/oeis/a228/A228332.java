package irvine.oeis.a228;
// Generated by gen_seq4.pl holos [[0],[-210,778,3572,-2788,-9398,4074,6720,-3360],[0,-10,76,-164,-124,756,-735,210]] [1,68] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A228332 Let h(m) denote the sequence whose n-th term is Sum_{k=0..n} (k+1)^m*T(n,k)^2, where T(n,k) is the Catalan triangle A039598. This is h(6).
 * @author Georg Fischer
 */
public class A228332 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228332() {
    super(0, "[[0],[-210,778,3572,-2788,-9398,4074,6720,-3360],[0,-10,76,-164,-124,756,-735,210]]", "[1,68]", 0);
  }
}
