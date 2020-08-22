package irvine.oeis.a036;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a001.A001969;

/**
 * A036585 Ternary Thue-Morse sequence: closed under a-&gt;abc, b-&gt;ac, c-&gt;b.
 * @author Georg Fischer
 */
public class A036585 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036585() {
    super(new A001969());
  }
}
