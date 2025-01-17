package irvine.oeis.a286;
// Generated by gen_seq4.pl mortra at 2021-09-23 21:42

import irvine.oeis.MorphismTransform;
import irvine.oeis.a171.A171588;

/**
 * A286688 {0-&gt;00, 1-&gt;10}-transform of the Pell word, A171588.
 * @author Georg Fischer
 */
public class A286688 extends MorphismTransform {

  /** Construct the sequence. */
  public A286688() {
    super(new A171588(), "0->00, 1->10");
  }
}
