package irvine.oeis.a270;
// Generated by gen_seq4.pl holos [[0],[12,-88,192,-128],[0,0,1,2]] [1,4,84] 0 at 2020-03-14 22:45
// Recurrence: n^2*(2*n+1)*a[n+0]+4*-(4*n-3)*(2*n-1)*(4*n-1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A270577 Generalized Catalan numbers C(3,n), where the (m,n)-th Catalan is the number of paths in R^m from the origin to the point (n,...,n,(m-1)n) with m kinds of moves such that the path never rises above the hyperplane x_m = x_1+...+x_{m-1}.
 * @author Georg Fischer
 */
public class A270577 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A270577() {
    super(0, "[[0],[12,-88,192,-128],[0,0,1,2]]", "[1,4,84]", 0);
  }
}
