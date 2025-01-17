package irvine.oeis.a071;
// Generated by gen_seq4.pl eulerx at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002487;


/**
 * A071019 Euler transform of A002487.
 *
 * @author Georg Fischer
 */
public class A071019 extends EulerTransform {

  /** Construct the sequence. */
  public A071019() {
    super(new SkipSequence(new A002487(), 2), 1);
    next();
  }
}
