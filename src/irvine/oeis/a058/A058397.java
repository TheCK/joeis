package irvine.oeis.a058;
// Generated by gen_seq4.pl rowsums at 2021-11-09 23:39

import irvine.oeis.a026.A026820;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A058397 Row sums of partition triangle A026820.
 * @author Georg Fischer
 */
public class A058397 extends RowSumSequence {

  /** Construct the sequence. */
  public A058397() {
    super(new A026820());
  }
}
