package irvine.oeis.a080;
// Generated by gen_seq4.pl wraptr2 at 2021-10-17 19:42

import irvine.oeis.a024.A024000;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A080233 Triangle T(n,k) obtained by taking differences of consecutive pairs of row elements of Pascal's triangle A007318.
 * @author Georg Fischer
 */
public class A080233 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A080233() {
    super("1", new A024000());
  }
}
