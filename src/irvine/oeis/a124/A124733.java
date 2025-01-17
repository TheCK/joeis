package irvine.oeis.a124;
// Generated by gen_seq4.pl parm3 at 2021-10-25 21:44

import irvine.oeis.a052.A052179;
/**
 * A124733 Triangle read by rows: row n is the first row of the matrix M[n]^(n-1), where M[n] is the n X n tridiagonal matrix with main diagonal (2,3,3,...) and super- and subdiagonals (1,1,1,...).
 * @author Georg Fischer
 */
public class A124733 extends A052179 {

  /** Construct the sequence. */
  public A124733() {
    super(2, 3);
  }
}
